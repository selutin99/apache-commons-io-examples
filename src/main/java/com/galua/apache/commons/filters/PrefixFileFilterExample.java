package com.galua.apache.commons.filters;

import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;

public class PrefixFileFilterExample {

    public static void main(String[] args) {
        usingPrefixFileFilter();
    }


    private static void usingPrefixFileFilter() {
        //get the current directory
        File currentDirectory = new File(".");

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");
        for (String file : files) System.out.println(file);

        System.out.println("\nFile starting with md\n");
        String[] filesNames = currentDirectory.list(new PrefixFileFilter("README"));
        for (String filesName : filesNames) System.out.println(filesName);
    }
}
