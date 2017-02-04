package com.claudiu.blooddonor.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Claudiu on 1/28/2017.
 */

public class FireBaseService {
    

    public FirebaseUser getCurrentUser(){
        return FirebaseAuth.getInstance().getCurrentUser();
    }
}
