package com.galua.apache.commons;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class IOUtilsExample {

    private static String FILE_NAME = Constants.RESOURCE_FOLDER + "IOUtils.txt";

    public static void main(String[] args) {
        try {
            //Using BufferedReader
            System.out.println("BufferedReader:");
            readUsingTraditionalWay();

            //Using IOUtils
            System.out.println("\nApache Commons IO:");
            readUsingIOUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void readUsingTraditionalWay() throws IOException {
        try(BufferedReader bufferReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(FILE_NAME)))) {
            String line;
            while( ( line = bufferReader.readLine() ) != null ) System.out.println( line );
        }
    }


    private static void readUsingIOUtils() throws IOException {
        try(InputStream in = new FileInputStream(FILE_NAME)) {
            System.out.println( IOUtils.toString( in , StandardCharsets.UTF_8) );
        }
    }
}