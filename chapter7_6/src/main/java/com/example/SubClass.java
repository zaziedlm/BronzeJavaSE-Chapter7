package com.example;

public class SubClass extends SuperClass {
    // Implicit super constructor SuperClass() is undefined for default constructor. Must define an explicit constructor
    public void test() {
        System.out.println("test");
    }

}
