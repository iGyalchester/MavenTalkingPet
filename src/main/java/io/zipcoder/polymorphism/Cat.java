package io.zipcoder.polymorphism;

public class Cat extends Pet{
	public Cat(String kind, String name, String speak) {
		super(kind, name, speak);
	}

	@Override
	public void speech() {

		System.out.println("Meow Meow");
	}
}
