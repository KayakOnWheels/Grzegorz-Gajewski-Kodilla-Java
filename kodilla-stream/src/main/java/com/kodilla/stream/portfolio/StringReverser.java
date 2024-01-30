package com.kodilla.stream.portfolio;

import java.util.stream.IntStream;

public interface StringReverser {

    public static String reverse(String textInput) {

        String invertedText = "";
        for(int i = textInput.length()-1; i >= 0; i--) {
            invertedText += textInput.charAt(i);
        }
        return invertedText;
    };
}
