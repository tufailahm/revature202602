package org.example;
interface Consumable
{
    int measure();
    void consume(int quantity);
}
 interface Liquid  {
    public default void prepare() {
        // pour to a cup
        System.out.println("Prepare the liquid");
    }
    static void addWater(){
        System.out.println("Water added");
    }
    int measure();
}
class Drink
        implements Consumable, Liquid {
    public void consume(int quantity) {}
    public int measure() {return 0 ;}

    @Override
    public void prepare() {
        System.out.println("Drink is prepared");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Drink d = new Drink();
        d.consume(100);
        d.measure();
        d.prepare();
        Liquid.addWater();
    }

}
