package com.galua.apache.commons.filters;

import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.io.IOException;

public class WildCardFileFilter {

    public static void main(String[] args) {
        try {
            usingWildcardFileFilter();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void usingWildcardFileFilter() throws IOException {
        //get the current directory
        File currentDirectory = new File(".");

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");

        for (String file : files) {
            System.out.println(file);
        }

        System.out.println("\nFile name ending with t.\n");
        String[] filesNames = currentDirectory.list(new WildcardFileFilter("*t"));

        for (String filesName : filesNames) {
            System.out.println(filesName);
        }
    }
}
