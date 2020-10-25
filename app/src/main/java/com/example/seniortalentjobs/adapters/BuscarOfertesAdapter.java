package com.example.seniortalentjobs.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.example.seniortalentjobs.MainActivity;
import com.example.seniortalentjobs.R;
import com.example.seniortalentjobs.entities.BuscarOfertes;

import java.util.ArrayList;
import java.util.List;

public class BuscarOfertesAdapter extends ArrayAdapter{

/*        public BuscarOfertesAdapter(MainActivity context, List objects) {
// (context, 0, objects) needed to match the parent constructor!!!
            super(context, 0, objects);
        }*/

    public BuscarOfertesAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @Override
        public View getView(int position, View convertView, ViewGroup parent) {
// Get the data item for this position
            BuscarOfertes buscarOfertes = (BuscarOfertes) getItem(position);
// Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.listofertes, parent, false);
            }
// Lookup view for data population
            ImageView logoEmpresa = convertView.findViewById(R.id.logoempresa);
            TextView puesto = convertView.findViewById(R.id.puesto);
            TextView empresa = convertView.findViewById(R.id.empresa);
            TextView fechaPublicacion = convertView.findViewById(R.id.fechaoferta);
            TextView ubicacion = convertView.findViewById(R.id.ubicacion);
            TextView salario = convertView.findViewById(R.id.salario);
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
