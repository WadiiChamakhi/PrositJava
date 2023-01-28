package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo(55, "Clifornia Zoo", "California", 22);
		Animal lion = new Animal("Félins", "Simba the King lion", 15, true);
		Animal lion2 = new Animal("Félins", "Simba the King lion", 15, true);
		
		myZoo.addAnimal(lion);
		
		myZoo.addAnimal(lion2);
		myZoo.displayZoo();
		
		myZoo.displayAnimals();
		System.out.println(myZoo.searchAnimal(lion)); // renvoi 0 , l'indice de lion
		System.out.println(myZoo.searchAnimal(lion2)); // renvoi 0 , l'indice de lion

		
	}

}
