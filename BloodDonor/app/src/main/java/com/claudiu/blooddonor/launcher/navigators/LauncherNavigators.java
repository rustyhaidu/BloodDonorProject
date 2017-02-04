package com.claudiu.blooddonor.launcher.navigators;

import android.app.Activity;

import com.claudiu.blooddonor.launcher.presenter.LauncherPresenter;
import com.claudiu.blooddonor.navigators.LoginNavigator;
import com.claudiu.blooddonor.navigators.Navigator;
import com.claudiu.blooddonor.navigators.ProfileNavigator;

/**
 * Created by Claudiu on 2/4/2017.
 */

public class LauncherNavigators implements LauncherPresenter.Navigators {
    private final Activity mActivity;

    public LauncherNavigators(Activity activity) {
        mActivity = activity;
    }

    @Override
    public Navigator loginNavigator() {
        return new LoginNavigator(mActivity);
    }

    @Override
    public Navigator profileNavigator() {
        return new ProfileNavigator(mActivity);
    }
}
