package tn.esprit.gestionzoo.entities;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tn.esprit.gestionzoo.exceptions.FullZooException;

public class Zoo {
	private Set<Animal> animals;
	private String name;
	private String city;
	private int nbrCage;
	private TreeMap<Integer, TreeSet<Animal>> animalsCage;

	public Zoo(String name, String city, int nbrCage) {
		this.animals = new TreeSet<Animal>();
		this.name = name;
		this.city = city;
		setNbrCage(nbrCage);

		animalsCage = new TreeMap<Integer, TreeSet<Animal>>();
		for (int i = 0; i < this.nbrCage; i++) {
			addCage();
		}
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
		return this.animalsCage.size();
	}
	
	

	public TreeMap<Integer, TreeSet<Animal>> getAnimalsCage() {
		return animalsCage;
	}

	public void setAnimalsCage(TreeMap<Integer, TreeSet<Animal>> animalsCage) {
		this.animalsCage = animalsCage;
	}

	public void setNbrCage(int nbrCage) {
		if (nbrCage < 10) {
			System.err.println("zoo cant have less than 10 cages, setting to 10 cages");
			this.nbrCage = 10;
		} else if (nbrCage > 20) {
			System.err.println("zoo cant have more than 20 cages, setting to 20 cages");
			this.nbrCage = 20;
		} else {
			this.nbrCage = nbrCage;
		}
	}

	public void displayZoo() {
		System.out.println("name : " + this.name);
		System.out.println("city : " + this.city);
		System.out.println("number of cages : " + this.nbrCage);
		System.out.println("number of Animals : " + this.animals.size());
	}
	
	public void addCage() {
		if(getNbrCage()==20) {
			System.err.println("zoo cant have more than 20 cages");
		}
		else {
			this.animalsCage.put(getNbrCage(), new TreeSet<Animal>());
		}
	}
	
	public void affectAnimalToCage(int cageNumber, Animal animal) {
		if(cageNumber<getNbrCage())
		this.animalsCage.get(cageNumber).add(animal);
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
		for (Animal a : this.animals) {
			System.out.println(a);
		}
	}

	public void displayAllPredators() {
		System.out.println("Prédateurs : ");
		for (Animal a : this.animals) {
			if (a.estPredateur()) {
				System.out.println(a);
			}
		}
	}

	public void displayAllPreys() {
		System.out.println("Proies : ");
		for (Animal a : this.animals) {
			if (!a.estPredateur()) {
				System.out.println(a);
			}
		}
	}

	@Override
	public String toString() {
		return "Zoo [" + " name=" + name + ", city=" + city + ", nbrCage=" + nbrCage + ", numberOfAnimals="
				+ this.animals.size() + "]";
	}

}
