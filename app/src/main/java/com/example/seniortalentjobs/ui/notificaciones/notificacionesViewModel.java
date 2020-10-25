package com.example.seniortalentjobs.ui.notificaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class notificacionesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public notificacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
/*        mText.setValue("Ací se rebrà un missatge si hi ha un canvi en una candidatura o en missatges mitjançant un listview" +
                " que obrira el missatge corresponent o l'oferta en la que s'està inscrit"+
                ". Caldrà guardar en SQLlite l'estat de la candidatura en la que s'esta inscrit i la clau dels missatges. " +
                "Si la última no coincidix se publicará");*/
    }

    public LiveData<String> getText() {
        return mText;
    }
}