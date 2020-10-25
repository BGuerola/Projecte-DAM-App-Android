package com.example.seniortalentjobs.ui.ofertasFavoritas;

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
import com.example.seniortalentjobs.adapters.FavoritosAdapter;
import com.example.seniortalentjobs.entities.BuscarOfertes;
import com.example.seniortalentjobs.ui.buscarOfertes.BuscarOfertesViewModel;

import java.util.ArrayList;

public class OfertasFavoritasFragment extends Fragment {

    //String puesto, empresa, fechaPublicacion, ubicacion, salario;
    private ListView listview;
    private int[] writersPhoto={R.drawable.bernat,R.drawable.bernat,R.drawable.bernat};
    private String[] puesto={"Electromecánico", "Operario", "Comercial CSC"};
    private String[] empresa = {"Mercadona", "Velarte", "Mr. Jeff"};
    private String[] fechaPublicacion = {"1 de Enero de 2020", "6/06/2020", "7 de Abril"};
    private String[] ubicacion = {"Ribarroja", "Catarroja", "Valencia"};
    private String[] estado = {"Seleccionado", "Aceptado", "Descartado"};
    private String[] salario = {"18500 bruto año", "1200 brutos/mes", "40000/año más incentivos"};

    private OfertasFavoritasViewModel ofertasFavoritasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ofertasFavoritasViewModel =
                ViewModelProviders.of(this).get(OfertasFavoritasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ofertasfavoritas, container, false);
        final TextView textView = root.findViewById(R.id.text_ofertasfavoritas);
        ofertasFavoritasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
//        listview= getActivity().findViewById(R.id.listofertes);
//        listview=findViewById(R.id.listofertes);

        // Construct the data source
        ArrayList<BuscarOfertes> ofertesFavorites = new ArrayList<BuscarOfertes>();
        for (int i=0; i<3; i++) {
// Create a writer object
            BuscarOfertes aux = new BuscarOfertes(writersPhoto[i], puesto[i], empresa[i], fechaPublicacion[i], ubicacion[i], estado[i], salario[i]);
// Add to the ArrayList
            ofertesFavorites.add(aux);
        }
// Create the adapter to convert the array to views
        FavoritosAdapter adapter = new FavoritosAdapter(getActivity(),0, ofertesFavorites);
// Attach the adapter to a ListView
        listview = getActivity().findViewById(R.id.listofertesfavorites);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent (v.getContext(), OfertaActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }

}