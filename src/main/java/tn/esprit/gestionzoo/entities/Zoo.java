package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tn.esprit.gestionzoo.exceptions.FullZooException;
import tn.esprit.gestionzoo.interfaces.AnimalType;

public class Zoo {
	private List<Animal> animals;
	private String name;
	private String city;
	private int nbrCage;

	public Zoo(String name, String city, int nbrCage) {
		this.animals = new ArrayList<Animal>();
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
		System.out.println("number of Animals : " + this.animals.size());
	}

	public boolean addAnimal(Animal an) throws FullZooException {
		// check array full
		if (this.animals.size() == 50) {
			throw new FullZooException("Zoo is full");
		}
		if (this.animals.contains(an)) {
			System.out.println("Animal exists");
			return false;
		}
		this.animals.add(an);
		return true;
	}

	public boolean removeAnimal(Animal an) {
		return this.animals.remove(an);
	}

	public void displayAnimals() {
		for (int i = 0; i < this.animals.size(); i++) {
			System.out.println(this.animals.get(i));
		}
	}

	public void displayAllPredators() {
		System.out.println("Prédateurs : ");
		for (int i = 0; i < this.animals.size(); i++) {
			if (animals.get(i).estPredateur()) {
				System.out.println(animals.get(i));
			}
		}
	}

	public void displayAllPreys() {
		System.out.println("Proies : ");
		for (int i = 0; i < this.animals.size(); i++) {
			if (!(animals.get(i)).estPredateur()) {
				System.out.println(animals.get(i));
			}
		}
	}

	@Override
	public String toString() {
		return "Zoo [" + " name=" + name + ", city=" + city + ", nbrCage=" + nbrCage + ", numberOfAnimals="
				+ this.animals.size() + "]";
	}

}
