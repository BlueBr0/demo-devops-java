package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassTest a = new ClassTest("test");
        
        System.out.println(a.toString());
    }
    
    public static int sum(int a, int b) { return a + b; }
}
