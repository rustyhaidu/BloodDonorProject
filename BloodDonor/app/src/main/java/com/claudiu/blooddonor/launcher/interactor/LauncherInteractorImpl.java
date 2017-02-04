package com.claudiu.blooddonor.launcher.interactor;

import android.content.Intent;

import com.claudiu.blooddonor.firebase.FireBaseService;
import com.claudiu.blooddonor.firebase.FirebaseLogic;
import com.claudiu.blooddonor.launcher.presenter.LauncherPresenter;
import com.claudiu.blooddonor.launcher.view.MainActivity;
import com.claudiu.blooddonor.login.view.LoginActivity;

/**
 * Created by Claudiu on 1/28/2017.
 */

public class LauncherInteractorImpl implements LauncherInteractor {
    private final FirebaseLogic mFirebaseLogic;

    public LauncherInteractorImpl(FirebaseLogic fireBaseLogic) {
        mFirebaseLogic = fireBaseLogic;
    }

    @Override
    public boolean isUserAuthenticated() {
       return mFirebaseLogic.isCurrentUser();
    }
}
