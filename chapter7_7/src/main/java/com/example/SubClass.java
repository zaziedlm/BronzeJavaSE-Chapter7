package com.example;

public class SubClass extends SuperClass {

    public SubClass() {
        // insert code here
        //SubClass("B");
        this("B");
        //super("B");
        //SuperClass("B");
    }

    public SubClass(String val) {
        System.out.println(val);
    }
}
