package com.safalifter.twitterclone.bucket;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BucketName {
    PROFILE_IMAGE("safalifter.twitter-clone");
    private final String bucketName;
}