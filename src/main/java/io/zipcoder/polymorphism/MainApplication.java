package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        Scanner petNumScanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petNum = petNumScanner.nextInt();



        for (int i = 0; i < petNum; i++){
            //pet kind input
            Scanner PetKindScanner = new Scanner(System.in);
            System.out.println("What kind of pet do you have? (One at a time, please)");
            String petKind = PetKindScanner.nextLine();


            //petName input
            Scanner PetNameScanner = new Scanner(System.in);
            System.out.println("What is your pet's name?");
            String petName = PetNameScanner.nextLine();

            //speech input
            Scanner PetSpeakScanner = new Scanner(System.in);
            System.out.println("What does your pet say when it speaks?");
            String petSpeak = PetSpeakScanner.nextLine();


            if (petKind.equalsIgnoreCase("dog")){
                Dog dog = new Dog(petKind, petName, petSpeak);
                pets.add(dog);

            } else if (petKind.equalsIgnoreCase("cat")){
                Cat cat = new Cat(petKind, petName, petSpeak);
                pets.add(cat);

            } else {
                CreatePet newPet =new CreatePet(petKind, petName, petSpeak);
                pets.add(newPet);
            }
        }
        System.out.println(pets);

        Pet.speech(pets);
    }

}
