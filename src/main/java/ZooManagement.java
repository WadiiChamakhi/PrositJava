import java.util.Scanner;

public class ZooManagement {

	public static void main(String[] args) {
		int nbrCage = 20;
		String zooName = "my zoo";
		Scanner sc = new Scanner(System.in);
		
		//Récupération du nom du zoo
		System.out.println("Veuillez entrer le nom du zoo");
		zooName = sc.next();
		
		//Récupération du nombre de cages
		System.out.println("Veuillez entrer le nombre de cages");
		nbrCage = sc.nextInt();
		
		//Vérification des entrées
		if(nbrCage>0 && zooName!="") {
			System.out.println(zooName+" comporte "+nbrCage+" cages");
		}
		else {
			System.out.println("entrées non valide");
		}
	}

}
