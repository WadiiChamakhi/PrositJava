package tn.esprit.gestionzoo.interfaces;

public interface AnimalType {
	public boolean estPredateur();

	public default String getStringType() {
		return " je suis " + (this.estPredateur() ? "un prédateur" : "une proie");
	}

}
