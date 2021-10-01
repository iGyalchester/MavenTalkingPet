package io.zipcoder.polymorphism;

public class CreatePet extends Pet{
	public CreatePet(String Kind, String name, String speak) {

		super(Kind, name, speak);
	}
	@Override
	public void speech() {
		System.out.println(this.speak);

	}

}
