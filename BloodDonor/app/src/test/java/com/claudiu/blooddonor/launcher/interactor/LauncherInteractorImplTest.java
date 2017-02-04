package com.claudiu.blooddonor.launcher.interactor;

import com.claudiu.blooddonor.firebase.FirebaseLogic;

import org.assertj.core.api.Java6Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Claudiu on 2/4/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class LauncherInteractorImplTest {
    private LauncherInteractorImpl mLauncherInteractor;

    @Mock
    FirebaseLogic mFirebaseLogic;
    @Before
    public void setUp() throws Exception {
        mLauncherInteractor = new LauncherInteractorImpl(mFirebaseLogic);
    }

    @Test
    public void isUserAuthenticated_whenUserExists_callsIsCurrentUser() throws Exception {
        when(mFirebaseLogic.isCurrentUser()).thenReturn(true);
        Java6Assertions.assertThat(mLauncherInteractor.isUserAuthenticated()).isTrue();

        verify(mFirebaseLogic).isCurrentUser();
    }

    @Test
    public void isUserAuthenticated_whenUserNull_callsIsCurrentUser() throws Exception {
        when(mFirebaseLogic.isCurrentUser()).thenReturn(false);
        Java6Assertions.assertThat(mLauncherInteractor.isUserAuthenticated()).isFalse();

        verify(mFirebaseLogic).isCurrentUser();
    }
}