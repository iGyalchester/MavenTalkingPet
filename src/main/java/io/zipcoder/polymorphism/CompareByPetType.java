package io.zipcoder.polymorphism;

import java.util.Comparator;

public class CompareByPetType implements Comparator<Pet> {

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getKind().compareTo(o2.getKind());

	}
}
