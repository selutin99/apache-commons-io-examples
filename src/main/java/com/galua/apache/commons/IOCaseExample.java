package com.galua.apache.commons;

import org.apache.commons.io.IOCase;

public class IOCaseExample {

    public static void main(String[] args) {
        usingIOCase();
    }


    private static void usingIOCase() {
        String text = "Welcome to Apache Commons Repository. Simply Easy Learning.";
        String text1 = "WELCOME TO APACHE COMMONS REPOSITORY. SIMPLY EASY LEARNING.";

        System.out.println("Ends with Learning (case sensitive): " +
                IOCase.SENSITIVE.checkEndsWith(text1, "Learning."));

        System.out.println("Ends with Learning (case insensitive): " +
                IOCase.INSENSITIVE.checkEndsWith(text1, "Learning."));

        System.out.println("Equality Check (case sensitive): " +
                IOCase.SENSITIVE.checkEquals(text, text1));

        System.out.println("Equality Check (case insensitive): " +
                IOCase.INSENSITIVE.checkEquals(text, text1));
    }
}
