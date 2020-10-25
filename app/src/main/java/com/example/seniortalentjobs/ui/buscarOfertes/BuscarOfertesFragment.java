package com.example.seniortalentjobs.ui.buscarOfertes;

import android.content.Intent;
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
import com.example.seniortalentjobs.adapters.BuscarOfertesAdapter;
import com.example.seniortalentjobs.entities.BuscarOfertes;

import java.util.ArrayList;

public class BuscarOfertesFragment extends Fragment {

    //String puesto, empresa, fechaPublicacion, ubicacion, salario;
    private ListView listview;
    private int[] writersPhoto={R.drawable.logo_senior_talent,R.drawable.logo_senior_talent,R.drawable.logo_senior_talent};
    private String[] puesto={"Electromecánico", "Operario", "Comercial CSC"};
    private String[] empresa = {"Induplas", "Velarte", "Ros Casares"};
    private String[] fechaPublicacion = {"1 de Enero de 2020", "6/06/2020", "7 de Abril"};
    private String[] ubicacion = {"Ribarroja", "Catarroja", "Valencia"};
    private String[] estado = {"Seleccionado", "Aceptado", "Descartado"};
    private String[] salario = {"18500 bruto año", "1200 brutos/mes", "40000/año más incentivos"};

    private BuscarOfertesViewModel buscarOfertesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       //


//        buscarOfertesViewModel =
//                ViewModelProviders.of(this).get(BuscarOfertesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_buscarofertas, container, false);
//        final TextView textView = root.findViewById(R.id.text_buscarofertes);
//        buscarOfertesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        listview= getActivity().findViewById(R.id.listofertes);
//        listview=findViewById(R.id.listofertes);

        // Construct the data source
        ArrayList<BuscarOfertes> buscarOfertes = new ArrayList<BuscarOfertes>();
        for (int i=0; i<3; i++) {
// Create a writer object
            BuscarOfertes aux = new BuscarOfertes(writersPhoto[i], puesto[i], empresa[i], fechaPublicacion[i], ubicacion[i], estado[i], salario[i]);
// Add to the ArrayList
            buscarOfertes.add(aux);
        }
// Create the adapter to convert the array to views
        BuscarOfertesAdapter adapter = new BuscarOfertesAdapter(getActivity(),0, buscarOfertes);
// Attach the adapter to a ListView
        listview = getActivity().findViewById(R.id.listofertes);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent (v.getContext(), OfertaActivity.class);
                startActivityForResult(intent, 0);
            }
        });


    //acció per al botó de fer búsquedes d'ofertes. Borrar al final
    View.OnClickListener Buscar=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Intent intent = new Intent(getContext(), ProvesMySQLActivity.class);
//            startActivity(intent);
            //sustituir acó per la crida a un fragment on fer la búsqueda d'ofertes
        }
    };

//    Button btn =(Button) getActivity().findViewById(R.id.btnfloatbuscarofertes);
//        btn.setOnClickListener(Buscar);
    //final de l'acció per al botó de proves. Borrar al final


    }
}