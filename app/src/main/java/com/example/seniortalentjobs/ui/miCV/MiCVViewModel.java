package com.example.seniortalentjobs.ui.miCV;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiCVViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MiCVViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mi CV fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}