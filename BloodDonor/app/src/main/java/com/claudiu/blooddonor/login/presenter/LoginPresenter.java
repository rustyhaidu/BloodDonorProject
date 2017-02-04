package com.claudiu.blooddonor.login.presenter;

import android.app.Activity;

import com.facebook.login.LoginResult;

/**
 * Created by Claudiu on 1/28/2017.
 */

public interface LoginPresenter {

    void onRegisterCallbackSuccess(Activity activity, LoginResult loginResult);
}
