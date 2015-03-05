package com.modele;

import java.util.Date;

public abstract class Animal {
	//Attributs
	double dureeDeVie;
	Date dateDeNaissance; //Sera mis a jour par la methode implementee de l'interface reproduction
	double coordoneeX;  
	double coordoneeY;
	Animal pere;
	Animal mere;
	Sexe sexe;  //De maniere a gérer le sexe aleatoirement par un mathRandom() par la methode implementee de l'interface reproduction
	//ArrayList <Animal> enfants;
	boolean isReproductible;
	
	//Methodes
	
	public boolean isReproductible() {
		return isReproductible;
	}

	public void setReproductible(boolean isReproductible) {
		this.isReproductible = isReproductible;
	}

	abstract void deplacement();
	
	abstract double calculDureeDeVie();
	
	abstract boolean seReproduire(Animal a);
	
	
	
}
