package com.hafizhamza.mvvmdemo.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class LoginModel {
   private String email,password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isvalid() {
        if (this.email!=null&&this.password!=null&& !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            return true;
        }
        else {
            return false;
        }
    }
}
