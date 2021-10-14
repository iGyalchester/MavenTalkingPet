package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {
		ArrayList<Pet> pets = new ArrayList<>();

		/*ask for user input using scanner method and
		storing their input into a variable Scanner data type variable petNumScanner.
		 */
		Scanner petNumScanner = new Scanner(System.in);
		int petNum; //initialize an empty integer variable petNum, which will be used in the while loop.
		do {
			/*
			line 19 is asking the user how many pets they have (we are still getting the user input).
			 */
			System.out.println("How many pets do you have?");

			while (!petNumScanner.hasNextInt()) {
				System.out.println("Please enter a valid input.");
				System.out.println("Please enter the number of pet you have.");
				petNumScanner.next(); // this is important! This is going to allow the program to keep asking user for an input.
			}
			//after user inputs an integer, their input is then stored into a variable called petNum,
			//which the while loop will then check if the
			petNum = petNumScanner.nextInt();
		} while (petNum <= 0);

		/*
		//if i is less than petNum, then everything inside the for loop is gonna run.
		when done, i goes up by 1. now since i went up by 1, it will check if i < petNum.
		If true, code inside for loop will repeat until i <! petNum.
		 */
		for (int i = 0; i < petNum; i++){
			//pet kind input
			Scanner PetKindScanner = new Scanner(System.in);
			System.out.println("What kind of pet(s) do you have? (One at a time, please)");
			String petKind = PetKindScanner.nextLine();


			//petName input
			Scanner PetNameScanner = new Scanner(System.in);
			System.out.println("What is your pet's name?");
			String petName = PetNameScanner.nextLine();

			//speech input
			Scanner PetSpeakScanner = new Scanner(System.in);
			System.out.println("What does your pet say when it speaks?");
			String petSpeak = PetSpeakScanner.nextLine();

			if (petKind.toLowerCase().contains("dog")){
				Dog dog = new Dog("Dog", petName, petSpeak);
				pets.add(dog);


			} else if(petKind.toLowerCase().contains("cat")){
				Cat cat = new Cat("Cat", petName, petSpeak);
				pets.add(cat);
				 //call the speech method using a period on the reference variable (cat) pointing to that object.

			} else {
				CreatePet newPet =new CreatePet(petKind, petName, petSpeak);
				pets.add(newPet);
				//reference variable newPet/ calling speech from the object that newPet is calling to.
			}
			Collections.sort(pets);
		}

		System.out.println(pets);

		Comparator<Pet> compare = new CompareByPetType();
		pets.sort(compare);
	}

}
