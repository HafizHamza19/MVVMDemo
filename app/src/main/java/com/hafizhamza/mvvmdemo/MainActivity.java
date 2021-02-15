package com.hafizhamza.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.hafizhamza.mvvmdemo.Model.LoginModel;
import com.hafizhamza.mvvmdemo.viewmodel.LoginViewModel;
import com.hafizhamza.mvvmdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        LoginViewModel loginViewModel= ViewModelProviders.of(this,new LoginViewModelFactory(this,new LoginModel())).get(LoginViewModel.class);
        binding.setLoginModel(loginViewModel);
    }
}
