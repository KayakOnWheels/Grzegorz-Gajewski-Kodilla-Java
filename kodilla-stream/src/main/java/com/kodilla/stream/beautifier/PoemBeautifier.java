package com.kodilla.stream.beautifier;

import com.kodilla.stream.lambda.Executor;

public class PoemBeautifier {

    public void beautify(String input, PoemDecorator poemDecorator) {
        String s = poemDecorator.decorate(input);
        System.out.println("Beautfied text:" + s);
    }
}
