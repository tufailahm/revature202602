package org.example;

public class Demo {
    static int i=100;

          //String is immutable
        // String  class in final
        //String belongs to java.lang package
    public static void main(String[] args) {
        String name="Rohan";
        name = "Riya";
        System.out.println(name);
        String name2 = new String("Riya");

        name.concat(" Sharma");         //Riya Sharma

        System.out.println(name==name2 );       //reference
        System.out.println(name.equals(name2));      //values
        System.out.println(name);

    }
     static class DecryptPassword
    {

    }
    static class ChangePassword extends  DecryptPassword
    {

    }
    class EncryptPassword extends  ChangePassword
    {

    }
}
