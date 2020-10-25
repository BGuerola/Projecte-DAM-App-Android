package com.example.seniortalentjobs.ui.buscarOfertes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuscarOfertesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BuscarOfertesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ofertas en las que estás inscrito");
    }

    public LiveData<String> getText() {
        return mText;
    }
}