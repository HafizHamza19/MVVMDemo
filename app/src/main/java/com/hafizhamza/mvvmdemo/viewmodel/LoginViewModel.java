package com.hafizhamza.mvvmdemo.viewmodel;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.hafizhamza.mvvmdemo.Model.LoginModel;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<String> email=new MutableLiveData<>();
    public MutableLiveData<String> password=new MutableLiveData<>();
   private Context context;
    public LoginModel loginModel;

    public LoginViewModel(Context context, LoginModel loginModel) {
        this.context = context;
        this.loginModel = loginModel;
    }
public void onloginclick()
{
loginModel.setEmail(email.getValue());
    loginModel.setPassword(password.getValue());
    if (loginModel.isvalid()) {
        Toast.makeText(context, "Submitted"+email.getValue(), Toast.LENGTH_SHORT).show();
    }
    else {
        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show();
    }
}
}
