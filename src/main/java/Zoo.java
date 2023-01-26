import java.util.Arrays;

public class Zoo {
	Animal[] animals;
	String name;
	String city;
	int nbrCage;
	int numberOfAnimals;

	public Zoo(int nbrAnimals, String name, String city, int nrbCage) {
		this.animals = new Animal[nbrAnimals];;
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
		this.animals[numberOfAnimals] = an;
		this.numberOfAnimals++;
		return true;
	}

	@Override
	public String toString() {
		return "Zoo [" + " name=" + name + ", city=" + city + ", nbrCage=" + nbrCage  + ", numberOfAnimals=" + numberOfAnimals + "]";
	}

}
