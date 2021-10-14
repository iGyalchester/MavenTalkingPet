package io.zipcoder.polymorphism;

import org.jetbrains.annotations.NotNull;

public class Dog extends Pet{
    public Dog(String kind, String name, String speak) {
        //calling constructor of the patent object
        super(kind, name, speak);
    }

    @Override
    public void speech() {
        System.out.println("Bork Bork");
    }

}