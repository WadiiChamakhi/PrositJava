package tn.esprit.gestionzoo.entities;

public class Lion extends Animal{
	int circonferenceCriniere ;

	public Lion(String family, String name, int age, boolean isMammal, int circonferenceCriniere) {
		super(family, name, age, isMammal);
		this.circonferenceCriniere = circonferenceCriniere;
	}
	
	
}
