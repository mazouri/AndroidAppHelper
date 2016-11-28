package com.mazouri.lib_databingding.util;

/**
 * Created by wangdongdong on 16-11-28.
 */

public class MyStringUtils {
    public static String capitalize(final String word) {
        if (word.length() > 1) {
            return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
        }
        return word;
    }
}
