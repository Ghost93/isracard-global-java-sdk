package com.paymeservice.android.error;

/**
 * Created by loiho on 5/10/16.
 */
public class PayMeException extends Exception {

    public PayMeException() {
    }

    public PayMeException(String detailMessage) {
        super(detailMessage);
    }
}
