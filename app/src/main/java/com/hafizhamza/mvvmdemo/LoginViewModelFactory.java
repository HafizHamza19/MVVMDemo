package com.hafizhamza.mvvmdemo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.hafizhamza.mvvmdemo.Model.LoginModel;
import com.hafizhamza.mvvmdemo.viewmodel.LoginViewModel;

class LoginViewModelFactory implements ViewModelProvider.Factory {
    private Context context;
    private LoginModel loginModel;
    public LoginViewModelFactory(MainActivity mainActivity, LoginModel loginModel) {
        this.context=mainActivity;
        this.loginModel=loginModel;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(context,loginModel);
    }
}
