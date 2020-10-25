package com.example.seniortalentjobs.ui.candidaturas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CandidaturasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CandidaturasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ofertas de trabajo en las que eres candidato");
    }

    public LiveData<String> getText() {
        return mText;
    }
}