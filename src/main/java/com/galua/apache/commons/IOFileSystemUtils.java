package com.galua.apache.commons;

import org.apache.commons.io.FileSystemUtils;

import java.io.IOException;

public class IOFileSystemUtils {

    public static void main(String[] args) {
        try {
            System.out.println("Free Space " + FileSystemUtils.freeSpaceKb("C:/") + " Bytes");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
