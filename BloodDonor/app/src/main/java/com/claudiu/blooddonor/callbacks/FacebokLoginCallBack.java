package com.claudiu.blooddonor.callbacks;

import android.app.Activity;

import com.claudiu.blooddonor.login.presenter.LoginPresenter;
import com.claudiu.blooddonor.login.view.LoginView;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;

/**
 * Created by Claudiu on 1/28/2017.
 */

public class FacebokLoginCallBack implements FacebookCallback<LoginResult> {
    private final Activity mActivity;
    private final LoginPresenter mloginPresenter;
    private final LoginView mLoginView;

    public FacebokLoginCallBack(Activity activity,
                                LoginPresenter mloginPresenter,
                                LoginView loginView) {
        mActivity = activity;
        this.mloginPresenter = mloginPresenter;
        mLoginView = loginView;
    }

    @Override
    public void onSuccess(LoginResult loginResult) {
        //TODO Check if User already exists in DB
        mloginPresenter.onRegisterCallbackSuccess(mActivity,loginResult);
//                populateObjectFromGraphRequest(loginResult);
    }

    @Override
    public void onCancel() {
       mLoginView.showError("Cancelled");
    }

    @Override
    public void onError(FacebookException error) {
        mLoginView.showError(error.toString());
    }
}
