package com.galua.apache.commons;

import org.apache.commons.io.FilenameUtils;

public class IOFilenameUtilsExample {

    public static void main(String[] args) {
        //Using FilenameUtils
        usingFilenameUtils();
    }


    private static void usingFilenameUtils() {
        String path = "C:\\Users\\cools\\Projects\\Programming\\Learning Projects\\Java\\apache-commons-io\\src\\main\\resources\\IOUtils.txt";

        System.out.println("Full Path: " + FilenameUtils.getFullPath(path));
        System.out.println("Relative Path: " + FilenameUtils.getPath(path));
        System.out.println("Prefix: " + FilenameUtils.getPrefix(path));
        System.out.println("Extension: " + FilenameUtils.getExtension(path));
        System.out.println("Base: " + FilenameUtils.getBaseName(path));
        System.out.println("Name: " + FilenameUtils.getName(path));
    }
}
