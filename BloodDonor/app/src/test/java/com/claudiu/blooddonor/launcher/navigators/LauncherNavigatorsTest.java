package com.claudiu.blooddonor.launcher.navigators;

import android.app.Activity;

import com.claudiu.blooddonor.navigators.LoginNavigator;
import com.claudiu.blooddonor.navigators.ProfileNavigator;

import org.assertj.core.api.Java6Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by Claudiu on 2/4/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class LauncherNavigatorsTest {

    private LauncherNavigators mLauncherNavigators;

    @Mock
    Activity mActivity;


    @Before
    public void setUp() throws Exception {
        mLauncherNavigators = new LauncherNavigators(mActivity);
    }

    @Test
    public void loginNavigator() throws Exception {

        Java6Assertions
                .assertThat(mLauncherNavigators.loginNavigator())
                .isInstanceOf(LoginNavigator.class);
    }

    @Test
    public void profileNavigator() throws Exception {
        Java6Assertions
                .assertThat(mLauncherNavigators.profileNavigator())
                .isInstanceOf(ProfileNavigator.class);
    }

}