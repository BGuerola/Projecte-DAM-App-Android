package com.example.seniortalentjobs.ui.buscarOfertes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.seniortalentjobs.OfertaActivity;
import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.adapters.BuscarOfertesAdapter;
import com.example.seniortalentjobs.entities.BuscarOfertes;
import com.example.seniortalentjobs.entities.OfertaTreball;
import com.example.seniortalentjobs.interfaces.RetrofitService;

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.widget.Toast.LENGTH_SHORT;
import static androidx.constraintlayout.widget.Constraints.TAG;

public class BuscarOfertesFragment extends Fragment {

    EditText denominacio, ubicacio;
    List<OfertaTreball> ofertesRetrofit = new ArrayList<OfertaTreball>();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    RetrofitService service = retrofit.create(RetrofitService.class);

    //String puesto, empresa, fechaPublicacion, ubicacion, salario;
    private ListView listview;

    //versió mostra efecte
    private int[] writersPhoto={R.drawable.logo_senior_talent,R.drawable.logo_senior_talent,R.drawable.logo_senior_talent};
    private String[] puesto={"Electromecánico", "Operario", "Comercial CSC"};
    private String[] empresa = {"Induplas", "Velarte", "Ros Casares"};
    private String[] fechaPublicacion = {"1 de Enero de 2020", "6/06/2020", "7 de Abril"};
    private String[] ubicacion = {"Ribarroja", "Catarroja", "Valencia"};
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

        denominacio = root.findViewById(R.id.editTextPuesto);
        ubicacio= root.findViewById(R.id.editUbicacio);

        CargarCredencials(root);

        root.findViewById(R.id.btnBusqueda).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Buscando ofertas", Toast.LENGTH_SHORT).show();
                GuardarCredencials(v);
            }
        });
        return root;
    }

    public void CargarCredencials(View root){
        SharedPreferences prefs = this.getActivity().getSharedPreferences("busqueda", Context.MODE_PRIVATE);
        String b = prefs.getString("denominacio", "No existe información");
        String c = prefs.getString("ubicacio", "No existe información");
        denominacio.setText(b);
        ubicacio.setText(c);
    }
    public void GuardarCredencials(View root) {
        SharedPreferences prefs = this.getActivity().getSharedPreferences("busqueda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
        editor.putString("denominacio", denominacio.getText().toString());
        editor.putString("ubicacio", ubicacio.getText().toString());
        editor.commit();
        //finish();
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        listview= getActivity().findViewById(R.id.listofertes);
//        listview=findViewById(R.id.listofertes);

        //Per a funcionar des del Retrofit
        obtindreOfertes();
        // Construct the data source
        ArrayList<BuscarOfertes> buscarOfertes = new ArrayList<BuscarOfertes>();
        for (int i=0; i<puesto.length; i++) {
        // Create a writer object
            BuscarOfertes aux = new BuscarOfertes(writersPhoto[i], puesto[i], empresa[i], fechaPublicacion[i], ubicacion[i], salario[i]);
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
    }

    public void obtindreOfertes() {
        try {
            getAllOfertesTreball();
            if (!ofertesRetrofit.isEmpty()) {
                Toast.makeText(getContext(), "No hay ofertas de trabajo", LENGTH_SHORT).show();

            } else {
                TextView nofertes = (TextView) getView().findViewById(R.id.numofertes);
                nofertes.setText(ofertesRetrofit.size());
                for (int i=0; i<ofertesRetrofit.size();i++){
                    writersPhoto[i]=R.drawable.logo_senior_talent;
                    puesto[i]=ofertesRetrofit.get(i).getNomPuesto();
                    empresa[i]=ofertesRetrofit.get(i).getCif();
                    fechaPublicacion[i]=ofertesRetrofit.get(i).getPublicada();
                    ubicacion[i]=ofertesRetrofit.get(i).getResidencia();
                    salario[i]= String.valueOf(ofertesRetrofit.get(i).getMaxSal());
                }
            }
        } catch (Exception e) {
            Log.e(TAG, String.valueOf(e.getStackTrace()));
            Toast.makeText(getContext(), "No se ha podido realizar la conexión", Toast.LENGTH_SHORT).show();
        }
    }


    public void getAllOfertesTreball(){//s'han de posar variables per a fer CRUDS amb valors
        //tots els Strings se substituixen per objectes
        Call<List<OfertaTreball>> getLogin = service.getAllOfertesTreball();
        getLogin.enqueue(new Callback<List<OfertaTreball>>() {
            @Override
            public void onResponse(Call<List<OfertaTreball>> call, Response<List<OfertaTreball>> response) {
                if (!response.isSuccessful()) {
                    System.out.println("No hay valores");
                } else {
                    System.out.println(response);
                    ofertesRetrofit.addAll(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<OfertaTreball>> call, Throwable t) {
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }


}