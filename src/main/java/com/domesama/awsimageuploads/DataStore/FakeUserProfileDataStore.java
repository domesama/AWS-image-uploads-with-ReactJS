package com.domesama.awsimageuploads.DataStore;

import com.domesama.awsimageuploads.Profile.UserProfile;
import com.domesama.awsimageuploads.Profile.UserProfileDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "dome", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "hahayes", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
