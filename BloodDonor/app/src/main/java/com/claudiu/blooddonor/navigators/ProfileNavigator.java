package com.claudiu.blooddonor.navigators;

import android.app.Activity;
import android.content.Intent;

import com.claudiu.blooddonor.profile.view.ProfileActivity;

/**
 * Created by Claudiu on 2/4/2017.
 */

public class ProfileNavigator implements Navigator {
    private final Activity mActivity;
    public ProfileNavigator(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void navigate() {
        Intent intent = new Intent(mActivity,ProfileActivity.class);
        mActivity.startActivity(intent);
    }
}
