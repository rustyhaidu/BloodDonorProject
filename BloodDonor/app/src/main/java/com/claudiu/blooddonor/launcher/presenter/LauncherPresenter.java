package com.claudiu.blooddonor.launcher.presenter;

import com.claudiu.blooddonor.navigators.Navigator;

/**
 * Created by Claudiu on 1/28/2017.
 */

public interface LauncherPresenter {

    void onAppLaunch();

    interface Navigators {
        Navigator loginNavigator();

        Navigator profileNavigator();
    }

}
