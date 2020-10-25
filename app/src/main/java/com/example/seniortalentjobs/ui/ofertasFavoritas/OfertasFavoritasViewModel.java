package com.example.seniortalentjobs.ui.ofertasFavoritas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OfertasFavoritasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OfertasFavoritasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Ofertas favoritas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}