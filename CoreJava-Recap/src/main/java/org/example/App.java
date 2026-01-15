package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    int i=100;     // heap
    static int rates = 24;
    // Static variables are stored in the Method Area (Metaspace) because they belong to the class, not to any object or method.
    public void display(){
        int num=100;        //stack;
        App p = new App();     // local object is created in heap
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
