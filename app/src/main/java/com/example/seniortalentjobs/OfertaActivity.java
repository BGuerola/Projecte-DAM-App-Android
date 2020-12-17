package com.example.seniortalentjobs;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.example.seniortalentjobs.entities.OfertaProvisional;
import com.example.seniortalentjobs.utilidades.Commons;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OfertaActivity<setOnCheckedChangeListener> extends AppCompatActivity {

    public List<OfertaProvisional> listaFavoritos= new ArrayList<>();
    FileOutputStream fout = null;

    OfertaProvisional ofertaProvisional=new OfertaProvisional("nom","empresa","ubicacio",18100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.ins);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Inscribirse en la oferta", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void guardarTxt(View view) throws FileNotFoundException, IOException, ClassNotFoundException {
;
        listaFavoritos.add(ofertaProvisional);

        int permissionCheck = ContextCompat.checkSelfPermission(
                this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            Log.i("Mensaje", "No se tiene permiso para leer.");
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 225);
        } else {
            Log.i("Mensaje", "Se tiene permiso para leer y escribir!");
        }

        try {
            fout = new FileOutputStream(new File (getExternalFilesDir(null), Commons.getFitxer));

            ObjectOutputStream tub = new ObjectOutputStream(fout);
            tub.writeObject(ofertaProvisional);
            if (tub!=null) {
                fout.close();
            }
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            try{
                fout.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
    }
        System.out.println("Arxiu guardat en "+Commons.getFitxer);
    }
}