package com.example.seniortalentjobs.ui.candidaturas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.seniortalentjobs.OfertaActivity;
import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.adapters.BuscarOfertesAdapter;
import com.example.seniortalentjobs.adapters.CandidaturesAdapter;
import com.example.seniortalentjobs.entities.BuscarOfertes;

import java.util.ArrayList;

public class CandidaturasFragment extends Fragment {

    private CandidaturasViewModel candidaturasViewModel;
    private ListView listview;
    private int[] writersPhoto={R.drawable.logo_de_indra,R.drawable.logo_jeff,R.drawable.logo_mercadona};
    private String[] puesto={"Programador Full-stack", "Administrador BD", "Tester"};
    private String[] empresa = {"Indra", "Jeff", "Mercadona"};
    private String[] fechaPublicacion = {"1 de Juny de 2020", "6/08/2020", "8 de Setembre"};
    private String[] ubicacion = {"Alaquàs", "València", "Tavernes Blanques"};
    private String[] estado = {"Seleccionado", "Aceptado", "Descartado"};
    private String[] salario = {"18500 bruto año", "1800 brutos/mes", "26000€-33000€"};


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

/*        listview= getActivity().findViewById(R.id.listcandidatures);

        // Construct the data source
        ArrayList<BuscarOfertes> buscarOfertes = new ArrayList<BuscarOfertes>();
        for (int i=0; i<3; i++) {
// Create a writer object
            BuscarOfertes aux = new BuscarOfertes(writersPhoto[i], puesto[i], empresa[i], fechaPublicacion[i], publicacion[i], estado[i], salario[i]);
// Add to the ArrayList
            buscarOfertes.add(aux);
        }
// Create the adapter to convert the array to views
        CandidaturesAdapter adapter = new CandidaturesAdapter(getActivity(), 0, buscarOfertes);
// Attach the adapter to a ListView
        listview = listview.findViewById(R.id.listcandidatures);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent (v.getContext(), OfertaActivity.class);
                startActivityForResult(intent, 0);
            }
        });*/




        candidaturasViewModel =
                ViewModelProviders.of(this).get(CandidaturasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_candidaturas, container, false);
        final TextView textView = root.findViewById(R.id.text_candidaturas);
        candidaturasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;

    }

    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        listview= getActivity().findViewById(R.id.listcandidatures);
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
        CandidaturesAdapter adapter = new CandidaturesAdapter(getActivity(),0, buscarOfertes);
// Attach the adapter to a ListView
        listview = getActivity().findViewById(R.id.listcandidatures);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent (v.getContext(), OfertaActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}