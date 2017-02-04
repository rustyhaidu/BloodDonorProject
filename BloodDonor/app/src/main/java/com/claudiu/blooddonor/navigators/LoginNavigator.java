package com.claudiu.blooddonor.navigators;

import android.app.Activity;
import android.content.Intent;

import com.claudiu.blooddonor.login.view.LoginActivity;

/**
 * Created by Claudiu on 2/4/2017.
 */

public class LoginNavigator implements Navigator {
    private final Activity mActivity;
    public LoginNavigator(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void navigate() {
        Intent intent = new Intent(mActivity,LoginActivity.class);
        mActivity.startActivity(intent);
    }
}
