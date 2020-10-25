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
import com.example.seniortalentjobs.entities.Missatges;

import java.util.ArrayList;
import java.util.List;

public class MissatgesAdapter extends ArrayAdapter {
    public MissatgesAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
// Get the data item for this position
        Missatges missatges = (Missatges) getItem(position);
// Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listmissatges, parent, false);
        }
// Lookup view for data population
        TextView empresa = convertView.findViewById(R.id.missempresa);
        TextView fechaPublicacion = convertView.findViewById(R.id.missfecha);
// Populate the data into the template view using the data object
        empresa.setText(missatges.getNomempresa());
        fechaPublicacion.setText(missatges.getData_missatge());
// Return the completed view to render on screen
        return convertView;
    }
}
