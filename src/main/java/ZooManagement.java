import java.util.Scanner;

public class ZooManagement {

	public static void main(String[] args) {
		
		Zoo myZoo = new Zoo(25, "Clifornia Zoo", "California", 20);
		Animal lion = new Animal("Félins", "Simba the King lion", 15, true);
		
		System.out.println(myZoo.name);
		
	}

}
