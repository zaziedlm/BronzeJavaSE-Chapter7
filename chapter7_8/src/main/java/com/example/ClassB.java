package com.example;

public class ClassB extends ClassA {

    public ClassB() {
        super("A");
        this("B"); // Constructor call must be the first statement in a constructor
    }

    public ClassB(String val) {
        super(val);
    }
}
