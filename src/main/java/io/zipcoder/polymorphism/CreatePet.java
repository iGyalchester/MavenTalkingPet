package io.zipcoder.polymorphism;

public class CreatePet extends Pet{
	public CreatePet(String kind, String name, String speak) {

		super(kind, name, speak);
	}
	@Override
	public void speech() {
		System.out.println(this.speak);

	}

}
