package com.example;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        ClassB b = new ClassB();
        InfClassA a = b;
        ClassC c = (ClassC) a;
    }
}
