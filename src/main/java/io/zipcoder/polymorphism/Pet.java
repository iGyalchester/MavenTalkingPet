package io.zipcoder.polymorphism;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{
	public String kind, speak;
	private String name;

	public Pet(String kind, String name, String speak){

		this.name = name;
		this.kind = kind;
		this.speak = speak;
	}

	public String getName() {

		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public int compareTo(Pet s){
		return this.getName().compareTo(s.getName());
	}

	public void speech() {
		System.out.println(this.speak);

	}


	@Override
	public String toString() {
		return "Pet{" +
				"Kind='" + kind + '\'' +
				", Speak='" + speak + '\'' +
				", Name='" + name + '\'' +
				'}';
	}


}

