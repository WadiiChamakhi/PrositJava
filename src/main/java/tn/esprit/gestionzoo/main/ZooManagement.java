package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Lion;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo(55, "Clifornia Zoo", "California", 22);
		Lion lion = new Lion("Félins", "Simba the King lion", 15, true,20);
		Lion lion2 = new Lion("Félins", "Simba the King lion", 15, true,50);
		
		myZoo.addAnimal(lion);
		
		myZoo.addAnimal(lion2);
		myZoo.displayZoo();
		
		lion.seDeplacer();

		
	}

}
