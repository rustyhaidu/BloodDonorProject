package com.claudiu.blooddonor.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Claudiu on 2/4/2017.
 */

public class FirebaseLogic {
    private final FireBaseService mFireBaseService;

    public FirebaseLogic(FireBaseService fireBaseService) {
        mFireBaseService = fireBaseService;

    }

    public boolean isCurrentUser() {
        FirebaseUser user = mFireBaseService.getCurrentUser();

        if (user != null) {
          /* String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();
            String uid = user.getUid();*/

            /*mNmeTextView.setText(name);
            mEmailTextView.setText(email);
            mUidTextView.setText(uid);
            //goMyProfile();*/
            return true;
        } else {
            //goLoginScreen();
            return false;
        }
    }
}
