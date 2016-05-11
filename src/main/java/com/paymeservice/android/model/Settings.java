package com.paymeservice.android.model;

/**
 * Created by loiho on 5/9/16.
 * <p/>
 * This class using settings for the PayMe SDK.
 */
public class Settings {
    public static final String PRODUCTION_ADDRESS = "https://ng.paymeservice.com/api";
    public static final String STAGING_ADDRESS = "https://preprod.paymeservice.com/api";

    public Environment environment = Environment.STAGING;
    public String sellerKey;

    public Settings(String sellerKey, Environment environment) {
        this.sellerKey = sellerKey;
        this.environment = environment;
    }

    public enum Environment {
        STAGING, PRODUCTION
    }


    public Environment getEnvironment() {
        return environment;
    }

    public String getSellerKey() {
        return sellerKey;
    }
}
