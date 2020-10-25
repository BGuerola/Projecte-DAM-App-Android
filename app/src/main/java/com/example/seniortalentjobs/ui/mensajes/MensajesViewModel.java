package com.example.seniortalentjobs.ui.mensajes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MensajesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MensajesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" ");
        //mText.setValue("Se rep un missatge. Se llig d'una tabla missages els corresponents a id del usuari i se carreguen en un listview que se ampliará a un missatges sencer.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}