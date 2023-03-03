package tn.esprit.gestionzoo.entities;
import java.util.Arrays;

import tn.esprit.gestionzoo.interfaces.AnimalType;

public class Zoo {
	private Animal[] animals;
	private String name;
	private String city;
	private int nbrCage;
	private int numberOfAnimals;

	public Zoo(int nbrAnimals, String name, String city, int nbrCage) {
		if (nbrAnimals > 50) {
			System.err.println("zoo cant have more than 50 animals, setting to 50 animals");
			this.animals = new Animal[50];
		} else if (nbrAnimals>0){
			this.animals = new Animal[nbrAnimals];
		}else {
			this.animals = new Animal[0];
		}
		this.name = name;
		this.city = city;
		setNbrCage(nbrCage);
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getNbrCage() {
		return nbrCage;
	}



	public void setNbrCage(int nbrCage) {
		if (nbrCage < 10) {
			System.err.println("zoo cant have less than 10 cages, setting to 10 cages");
		} else if (nbrCage > 20) {
			System.err.println("zoo cant have more than 20 cages, setting to 20 cages");
		}
	}



	public void displayZoo() {
		System.out.println("name : " + this.name);
		System.out.println("city : " + this.city);
		System.out.println("number of cages : " + this.nbrCage);
		System.out.println("number of Animals : " + this.numberOfAnimals);
	}

	public boolean addAnimal(Animal an) {
		// check array full
		if (numberOfAnimals == animals.length) {
			System.out.println("Zoo is full");
			return false;
		}
		if (searchAnimal(an) != -1) {
			System.out.println("Animal exists");
			return false;
		}
		this.animals[numberOfAnimals] = an;
		this.numberOfAnimals++;
		return true;
	}

	public boolean removeAnimal(Animal an) {
		int index = searchAnimal(an);
		if (index == -1) {
			return false;
		}
		for (int i = index; i < numberOfAnimals - 1; i++) {
			animals[i] = animals[i + 1];
		}
		numberOfAnimals--;
		return true;
	}

	public void displayAnimals() {
		for (int i = 0; i < this.numberOfAnimals; i++) {
			System.out.println(animals[i]);
		}
	}
	
	public void displayAllPredators() {
		System.out.println("Prédateurs : ");
		for (int i = 0; i < this.numberOfAnimals; i++) {
			if(((AnimalType)(animals[i])).estPredateur()) {
				System.out.println(animals[i]);
			}
		}
	}
	public void displayAllPreys() {
		System.out.println("Proies : ");
		for (int i = 0; i < this.numberOfAnimals; i++) {
			if(!((AnimalType)(animals[i])).estPredateur()) {
				System.out.println(animals[i]);
			}
		}
	}
	public int searchAnimal(Animal an) {
		for (int i = 0; i < this.numberOfAnimals; i++) {
			if (animals[i].equals(an)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return "Zoo [" + " name=" + name + ", city=" + city + ", nbrCage=" + nbrCage + ", numberOfAnimals="
				+ numberOfAnimals + "]";
	}

}
