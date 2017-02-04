package com.claudiu.blooddonor.login.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.claudiu.blooddonor.R;
import com.claudiu.blooddonor.callbacks.FacebokLoginCallBack;
import com.claudiu.blooddonor.launcher.view.MainActivity;
import com.claudiu.blooddonor.login.presenter.LoginPresenter;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginActivity extends AppCompatActivity implements LoginView{
    private LoginPresenter mLoginPresenter;
    private LoginButton mLoginButton;
    private CallbackManager mCallbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mCallbackManager = CallbackManager.Factory.create();
        mLoginButton = (LoginButton) findViewById(R.id.loginButton);

        mLoginButton.setReadPermissions(getResources().getStringArray(R.array.facebook_permissions));
        mLoginButton.registerCallback(mCallbackManager,
                new FacebokLoginCallBack(this,mLoginPresenter,this));

        mLoginButton = (LoginButton) findViewById(R.id.loginButton);
        //mTextView = (TextView)findViewById(R.id.textview);

        mCallbackManager = CallbackManager.Factory.create();
    }


    @Override
    public void showError(String cancelled) {

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        mCallbackManager.onActivityResult(requestCode,resultCode,data);
    }
}
