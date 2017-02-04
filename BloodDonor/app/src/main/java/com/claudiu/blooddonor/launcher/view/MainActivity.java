package com.claudiu.blooddonor.launcher.view;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import com.claudiu.blooddonor.R;
import com.claudiu.blooddonor.launcher.presenter.LauncherPresenter;
import com.claudiu.blooddonor.login.view.LoginActivity;
import com.facebook.FacebookSdk;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.claudiu.blooddonor.util.Utility.printKeyHash;

public class MainActivity extends AppCompatActivity {
    private LauncherPresenter mLauncherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printKeyHash(this);
      //  mLauncherPresenter.onAppLaunch();


        Intent intent = new Intent();
        intent.setClass(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

}
