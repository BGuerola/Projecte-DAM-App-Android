package com.example.seniortalentjobs.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.entities.BuscarOfertes;

import java.util.List;

public class FavoritosAdapter extends ArrayAdapter {

/*        public BuscarOfertesAdapter(MainActivity context, List objects) {
// (context, 0, objects) needed to match the parent constructor!!!
            super(context, 0, objects);
        }*/

    public FavoritosAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// Get the data item for this position
        BuscarOfertes buscarOfertes = (BuscarOfertes) getItem(position);
// Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listofertesfavorites, parent, false);
        }
// Lookup view for data population
        ImageView logoEmpresa = convertView.findViewById(R.id.favlogoempresa);
        TextView puesto = convertView.findViewById(R.id.favpuesto);
        TextView empresa = convertView.findViewById(R.id.favempresa);
        TextView fechaPublicacion = convertView.findViewById(R.id.favfechaoferta);
        TextView ubicacion = convertView.findViewById(R.id.favubicacion);
        TextView salario = convertView.findViewById(R.id.favsalario);
// Populate the data into the template view using the data object
        logoEmpresa.setImageResource(buscarOfertes.getLogoEmpresa());
        puesto.setText(buscarOfertes.getPuesto());
        empresa.setText(buscarOfertes.getEmpresa());
        fechaPublicacion.setText(buscarOfertes.getFechaPublicacion());
        ubicacion.setText(buscarOfertes.getUbicacion());
        salario.setText(buscarOfertes.getSalario());
// Return the completed view to render on screen
        return convertView;
    }
}
