package com.stackroute.solidprinciplestask;

public class Main {
    public static void main(String[] args) {
        Editor ed=new Editor();
        ed.createText();
        ed.enterText("Hello world");
        ed.allLettersToUpperCase();
        ed.findSubTextAndDelete("Hello world");
        ed.printText();
        ed.setAuthor("Siva datta");
        ed.getAuthor();
        ed.setLength();
        ed.getLength();
    }

}
