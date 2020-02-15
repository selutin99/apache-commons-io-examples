package com.galua.apache.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class IOFilesExample {

    private static String FILE_NAME = Constants.RESOURCE_FOLDER + "IOUtils.txt";

    public static void main(String[] args) {
        try {
            //Using FileUtils
            usingFileUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void usingFileUtils() throws IOException {
        //get the file object
        File file = FileUtils.getFile(FILE_NAME);

        //get the temp directory
        File tmpDir = FileUtils.getTempDirectory();

        System.out.println(tmpDir.getPath());

        //copy file to temp directory
        FileUtils.copyFileToDirectory(file, tmpDir);

        //create a new file
        File newTempFile = FileUtils.getFile(tmpDir, file.getName());

        //get the content
        String data = FileUtils.readFileToString(newTempFile, Charset.defaultCharset());

        //print the content
        System.out.println(data);
    }
}
