package com.modele;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
	//Attributs
	double dureeDeVie;
	Date dateDeNaissance; //Sera mis � jour par la m�thode impl�ment� de l'interface reproduction
	double coordoneeX;  
	double coordoneeY;
	double newCoordonneeX;
	double newCoordonneeY;
	int vitesse;
	
	Animal pere;
	Animal mere;
	ArrayList<Animal> enfants;
	
	Sexe sexe;  //De mani�re � g�rer le sexe al�atoirement par un mathRandom() par la m�thode impl�ment� de l'interface reproduction
	//ArrayList <Animal> enfants;
	
	//M�thodes
	
	abstract void deplacement();
	
	abstract double calculDureeDeVie();
	
	protected boolean isParents(Animal b){
		return (this.pere == b || this.mere == b);	
	}
	
	protected void setParents(Animal papa, Animal maman){
		this.pere = papa;
		this.mere= maman;
	}
	
	protected void setChildren(Animal a){
		this.enfants.add(a);
	}
	
	public boolean isChild(Animal b){
		return (this.enfants.contains(b));	
	}
	
	public boolean isBrother(Animal b){
		return (this.enfants.contains(b));	
	}
	
	boolean seReproduire(Animal a) {
		return false;
	}
	
}
