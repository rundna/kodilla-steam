package com.kodilla.stream.beautifier;

import java.util.Collections;

public class BeautifulMain {
    public static void main(String[] args){
        PoemBeautifier poemDecor = new PoemBeautifier();
        poemDecor.beautify("Bagietka",text -> text.toUpperCase());
        poemDecor.beautify("Java",text -> String.join("", Collections.nCopies(10, text))); //bold, itallic itp?
        poemDecor.beautify("Hultaj",text -> "###" + text +"###");
        poemDecor.beautify("Wiosna",text -> text.replace("Wi","Rad")+" "+text);
    }
}
