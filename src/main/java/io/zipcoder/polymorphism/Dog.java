package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String Kind, String name, String speak) {
        //calling constructor of the patent object
        super(Kind, name, speak);
    }

    @Override
    public void speech() {
        System.out.println("Bork Bork");
    }
}