package com.paymeservice.android.error;

/**
 * Created by loiho on 5/10/16.
 */
public class PayMeError {
    private int statusCode;
    private int statusErrorDetails;
    private int statusAdditionalInfo;
    private int statusErrorCode;

    public int getStatusCode() {
        return statusCode;
    }

    public int getStatusErrorDetails() {
        return statusErrorDetails;
    }

    public int getStatusAdditionalInfo() {
        return statusAdditionalInfo;
    }

    public int getStatusErrorCode() {
        return statusErrorCode;
    }
}
