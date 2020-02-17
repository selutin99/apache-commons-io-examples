package com.galua.apache.commons.filters;

import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;

public class SuffixFileFilterExample {

    public static void main(String[] args) {
        usingSuffixFileFilter();
    }


    private static void usingSuffixFileFilter() {
        //get the current directory
        File currentDirectory = new File(".");

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");
        for (String file : files) {
            System.out.println(file);
        }

        System.out.println("\nFile with extenstion md\n");
        String[] filesNames = currentDirectory.list(new SuffixFileFilter("md"));
        for (String filesName : filesNames) {
            System.out.println(filesName);
        }
    }
}
