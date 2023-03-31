package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Lion;
import tn.esprit.gestionzoo.entities.Perroquet;
import tn.esprit.gestionzoo.entities.Singe;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.exceptions.FullZooException;

public class ZooManagement {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo("Clifornia Zoo", "California", 19);
		
		Lion lion = new Lion("Félins", "Simba the King lion", 15, true,20);
		Perroquet pero = new Perroquet("oiseau", "charlie", 20, false, 120);
		Singe singe = new Singe("Primate", "mooky", 10, true);
		
		myZoo.addCage();
		myZoo.addCage();
		
		try {
			myZoo.addAnimal(lion);
			myZoo.addAnimal(pero);
			myZoo.addAnimal(singe);
		} catch (FullZooException e) {
			e.printStackTrace();
		}
		
		

		
	}

}
