package tn.esprit.gestionzoo.entities;

public class Dauphin extends Animal{
	int profondeurMaximale ;

	public Dauphin(String family, String name, int age, boolean isMammal, int profondeurMaximale) {
		super(family, name, age, isMammal);
		this.profondeurMaximale = profondeurMaximale;
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je suis un dauphin, je nage");
		
	}
	
	
}
