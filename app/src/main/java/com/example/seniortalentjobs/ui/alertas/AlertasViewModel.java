package com.example.seniortalentjobs.ui.alertas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlertasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlertasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Configura  tus alertas para recibir ofertas por email");
    }

    public LiveData<String> getText() {
        return mText;
    }
}