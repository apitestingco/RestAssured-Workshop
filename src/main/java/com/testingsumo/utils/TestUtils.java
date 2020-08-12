package com.testingsumo.utils;

public class TestUtils {

    public static String generateUniqueCode(String prefix) {

        return prefix + System.currentTimeMillis();
    }
}
