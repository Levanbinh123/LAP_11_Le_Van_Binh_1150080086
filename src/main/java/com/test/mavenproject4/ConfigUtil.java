package com.test.mavenproject4;

public class ConfigUtil {

    public static String getUsername() {
        String username = System.getenv("APP_USERNAME");

        if (username == null || username.isBlank()) {
            throw new RuntimeException("Missing APP_USERNAME environment variable");
        }
        return username;
    }

    public static String getPassword() {
        String password = System.getenv("APP_PASSWORD");

        if (password == null || password.isBlank()) {
            throw new RuntimeException("Missing APP_PASSWORD environment variable");
        }
        return password;
    }

    public static String getBaseUrl() {
        return "https://www.saucedemo.com";
    }
}