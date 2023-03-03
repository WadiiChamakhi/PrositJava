package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.AnimalType;

public class Dauphin extends Animal implements AnimalType{
	int profondeurMaximale ;

	public Dauphin(String family, String name, int age, boolean isMammal, int profondeurMaximale) {
		super(family, name, age, isMammal);
		this.profondeurMaximale = profondeurMaximale;
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je suis un dauphin, je nage");
		
	}

	@Override
	public String toString() {
		return "Dauphin [profondeurMaximale=" + profondeurMaximale + "]"+ super.toString();
	}

	public boolean estPredateur() {
		return true;
	}
	
	
	
}
