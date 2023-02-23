package tn.esprit.gestionzoo.entities;

public class Perroquet extends Animal{
	int hauteurMaximale ;

	public Perroquet(String family, String name, int age, boolean isMammal, int hauteurMaximale) {
		super(family, name, age, isMammal);
		this.hauteurMaximale = hauteurMaximale;
	}

	@Override
	public void seDeplacer() {
		System.out.println("Je suis un perroquet, je vole");
		
	}

	@Override
	public String toString() {
		return "Perroquet [hauteurMaximale=" + hauteurMaximale + "]"+ super.toString();
	}
	
	
	
	
}
