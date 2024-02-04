package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import java.io.File;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        //ClassLoader classLoader = fileReader.getClass().getClassLoader();
        //File file = new File(classLoader.getResource("names.txt").getFile());

        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}