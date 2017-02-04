package com.claudiu.blooddonor.launcher.presenter;

import com.claudiu.blooddonor.launcher.interactor.LauncherInteractor;

/**
 * Created by Claudiu on 1/28/2017.
 */

public class LauncherPresenterImpl implements LauncherPresenter{
    private final LauncherInteractor mLauncherInteractor;

    public LauncherPresenterImpl(LauncherInteractor launcherInteractor) {
        mLauncherInteractor = launcherInteractor;
    }

    @Override
    public void onAppLaunch() {
        if (mLauncherInteractor.isUserAuthenticated()){
            
        }
    }
}
