package com.domesama.awsimageuploads.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    @Autowired
    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService){
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }

    public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
        // 1. Check if image isn't empty
        // 2. If file in an image
        // 3. The user exists in our database
        // 4. Grab some metadata from file if any
        // 5. Store the image in S3 and update database with S3 iamge link
    }
}
