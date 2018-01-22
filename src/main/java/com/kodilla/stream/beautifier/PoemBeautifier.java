package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator decorationType){
        text =  decorationType.decorate(text);
        System.out.println(text);
    }
}
