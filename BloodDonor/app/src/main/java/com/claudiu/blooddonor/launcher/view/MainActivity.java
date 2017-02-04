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
import com.claudiu.blooddonor.firebase.FireBaseService;
import com.claudiu.blooddonor.firebase.FirebaseLogic;
import com.claudiu.blooddonor.launcher.interactor.LauncherInteractorImpl;
import com.claudiu.blooddonor.launcher.navigators.LauncherNavigators;
import com.claudiu.blooddonor.launcher.presenter.LauncherPresenter;
import com.claudiu.blooddonor.launcher.presenter.LauncherPresenterImpl;
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
        mLauncherPresenter =
                new LauncherPresenterImpl(
                        new LauncherInteractorImpl(
                                new FirebaseLogic(
                                        new FireBaseService())),
                        new LauncherNavigators(this));
        // TODO Dagger
        printKeyHash(this);
        mLauncherPresenter.onAppLaunch();
    }

}
