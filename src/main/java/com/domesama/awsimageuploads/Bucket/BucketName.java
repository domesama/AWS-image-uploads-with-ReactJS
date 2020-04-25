package com.domesama.awsimageuploads.Bucket;

public enum BucketName {

    PROFILE_IMAGE("give-me-ur-image");

    private final String bucketName;

    BucketName (String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
