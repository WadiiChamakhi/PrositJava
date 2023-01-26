import java.util.Arrays;

public class Zoo {
	Animal[] animals;
	String name;
	String city;
	int nbrCage;
	int numberOfAnimals;

	public Zoo(int nbrAnimals, String name, String city, int nrbCage) {
		this.animals = new Animal[nbrAnimals];
		;
		this.name = name;
		this.city = city;
		this.nbrCage = nrbCage;
	}

	void displayZoo() {
		System.out.println("name : " + this.name);
		System.out.println("city : " + this.city);
		System.out.println("number of cages : " + this.nbrCage);
		System.out.println("number of Animals : " + this.numberOfAnimals);
	}

	boolean addAnimal(Animal an) {
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

	boolean removeAnimal(Animal an) {
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

	void displayAnimals() {
		for (int i = 0; i < this.numberOfAnimals; i++) {
			System.out.println(animals[i]);
		}
	}

	int searchAnimal(Animal an) {
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
