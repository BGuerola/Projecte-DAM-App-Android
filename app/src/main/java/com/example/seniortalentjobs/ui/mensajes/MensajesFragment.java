//Crear ListView de mensajes




package com.example.seniortalentjobs.ui.mensajes;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.seniortalentjobs.OfertaActivity;
import com.example.seniortalentjobs.ProvesMySQLActivity;
import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.adapters.CandidaturesAdapter;
import com.example.seniortalentjobs.adapters.MissatgesAdapter;
import com.example.seniortalentjobs.dao.ConexionSQLiteHelper;
import com.example.seniortalentjobs.entities.BuscarOfertes;
import com.example.seniortalentjobs.entities.Mensaje;
import com.example.seniortalentjobs.entities.Missatges;
import com.example.seniortalentjobs.utilidades.Commons;

import java.util.ArrayList;

public class MensajesFragment extends Fragment {

    private MensajesViewModel mensajesViewModel;
    private ListView listview;
    ArrayList listaMensajes, listaInformacion;

    ConexionSQLiteHelper conn;
   /* private String[] empresa = {"Indra", "Jeff", "Mercadona"};
    private String[] fechaPublicacion = {"1 de Juny de 2020", "6/08/2020", "8 de Setembre"};*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mensajesViewModel =
                ViewModelProviders.of(this).get(MensajesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mensajes, container, false);
        final TextView textView = root.findViewById(R.id.text_mensajes);
        mensajesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        conn=new ConexionSQLiteHelper(getActivity().getApplicationContext(), "Mensajes", null,1);
        listview= getActivity().findViewById(R.id.listmissatges);

        consultarListaMensajes();
        //        listview=findViewById(R.id.listofertes);

/*        // Construct the data source
        ArrayList<Missatges> missatges = new ArrayList<Missatges>();
        for (int i=0; i<3; i++) {
// Create a writer object
            Missatges aux = new Missatges(empresa[i], fechaPublicacion[i]);
// Add to the ArrayList
            missatges.add(aux);
        }
// Create the adapter to convert the array to views
        MissatgesAdapter adapter = new MissatgesAdapter(getActivity(),0, missatges);
// Attach the adapter to a ListView
        listview = getActivity().findViewById(R.id.listmissatges);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent (v.getContext(), OfertaActivity.class);
                startActivityForResult(intent, 0);
            }
        });*/
        //acció per al botó de proves. Borrar al final
        View.OnClickListener Proves=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProvesMySQLActivity.class);
                startActivity(intent);
            }
        };

        Button btn =(Button) getActivity().findViewById(R.id.btnproves);
        btn.setOnClickListener(Proves);
        //final de l'acció per al botó de proves. Borrar al final


    }

    private void consultarListaMensajes() {
        SQLiteDatabase db=conn.getReadableDatabase();
        Mensaje mensaje = null;
        listaMensajes=new ArrayList<Mensaje>();
        Cursor cursor=db.rawQuery("select * from "+ Commons.TABLA_MENSAJES, null);

            while (cursor.moveToNext()){
                mensaje=new Mensaje();
                mensaje.setIdmissat(0);
/*                mensaje.setCif(1);
                mensaje.setIdcand(2);
                mensaje.setDataMstg(3);
                mensaje.setMisstg(4);*/

                listaMensajes.add(mensaje);
            }
            obtenerLista();
    }

    private void obtenerLista() {
        listaInformacion=new ArrayList<String>();

        for (int i=0; i<listaMensajes.size();i++){
            //listaInformacion.add(listaMensajes.get(i).getCif()+" "+listaMensajes.get(i).getDataMstg());
        }

    }
}