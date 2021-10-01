package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String Kind, String name, String speak) {
        super(Kind, name, speak);
    }

    @Override
    public void speech() {
        System.out.println(this.speak);

    }
}