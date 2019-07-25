package com.stackroute.solidprinciplestask;

import java.sql.SQLOutput;

public class Editor {
    Text t1;

    public void allLettersToUpperCase() {
        System.out.println(this.t1.getText().toUpperCase());
    }
    public void createText(){
        Text t1=new Text();
        System.out.println("New text created");
        this.t1=t1;

    }

    public void enterText(String text) {
        this.t1.setText(text);
    }
    public void findSubTextAndDelete(String s1){
        s1="Hello world";
        String s2=s1.substring(6);
        String newstr;
        newstr=s1.replace(s2," ");
        System.out.println(newstr);
    }
    public void printText(){
        System.out.println(this.t1.getText());

    }
    public void setAuthor(String authorname) {
        this.t1.setAuthor(authorname);
    }
    public void getAuthor(){
        System.out.println(this.t1.getAuthor());
    }
    public void setLength(){
        this.t1.setLength(this.t1.getText().length());
    }
    public void getLength(){
        System.out.println(this.t1.getLength());
    }
}
