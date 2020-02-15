package com.galua.apache.commons.filters;

import com.galua.apache.commons.Constants;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.NameFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class NameFileFilterExample {

    public static void main(String[] args) {
        try {
            usingNameFileFilter();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void usingNameFileFilter() throws IOException {
        //get the current directory
        File currentDirectory = new File(Constants.RESOURCE_FOLDER);

        //get names of all files and directory in current directory
        String[] files = currentDirectory.list();
        System.out.println("All files and Folders.\n");

        for (String file : files) {
            System.out.println(file);
        }

        String[] acceptedNames = {"IOLineIterator.txt", "IOUtils.txt"};
        System.out.println("\nFiles with name " + Arrays.toString(acceptedNames) + "\n");
        String[] filesNames = currentDirectory.list(new NameFileFilter(acceptedNames, IOCase.INSENSITIVE));

        for (String filesName : filesNames) {
            System.out.println(filesName);
        }
    }
}
