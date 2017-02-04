package com.claudiu.blooddonor.launcher.presenter;

import com.claudiu.blooddonor.launcher.interactor.LauncherInteractor;
import com.claudiu.blooddonor.launcher.navigators.LauncherNavigators;

/**
 * Created by Claudiu on 1/28/2017.
 */

public class LauncherPresenterImpl implements LauncherPresenter {
    private final LauncherInteractor mLauncherInteractor;
    private final LauncherNavigators mLauncherNavigators;

    public LauncherPresenterImpl(LauncherInteractor launcherInteractor,
                                 LauncherNavigators launcherNavigators) {
        mLauncherInteractor = launcherInteractor;
        mLauncherNavigators = launcherNavigators;
    }

    @Override
    public void onAppLaunch() {
        if (mLauncherInteractor.isUserAuthenticated()) {
            mLauncherNavigators.profileNavigator().navigate();
        } else {
            mLauncherNavigators.loginNavigator().navigate();
        }
    }
}
