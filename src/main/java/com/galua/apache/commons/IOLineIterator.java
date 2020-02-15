package com.galua.apache.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

public class IOLineIterator {

    private static String FILE_NAME = Constants.RESOURCE_FOLDER + "IOLineIterator.txt";


    public static void main(String[] args) {
        try {
            usingLineIterator();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void usingLineIterator() throws IOException {
        //get the file object
        File file = FileUtils.getFile(FILE_NAME);

        try(LineIterator lineIterator = FileUtils.lineIterator(file)) {

            System.out.println("Contents of file:\n");

            while(lineIterator.hasNext()) {
                System.out.println(lineIterator.next());
            }
        }
    }
}
