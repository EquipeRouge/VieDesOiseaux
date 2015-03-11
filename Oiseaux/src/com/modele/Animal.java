package com.modele;

import java.util.*;
import java.util.Date;

import com.ressources.Parents;

public abstract class Animal {
	
	final static double DUREE_DE_VIE_MAX = 20;
	final static double DUREE_DE_VIE_MIN = 0;

	final static int HIGHER = 100;
	final static int LOWER = 0;
	
	
	//Attributs
	double dureeDeVie;
	Date dateDeNaissance; //Sera mis � jour par la m�thode impl�ment� de l'interface reproduction
	double coordoneeX;  
	double coordoneeY;
	double newCoordonneeX;
	double newCoordonneeY;
	int vitesse;
	Parents parents;
	
	List<Animal> enfants;
	
	Sexe sexe; 
	
	
	//M�thodes
	
	 void deplacement(){
		this.coordoneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.coordoneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeX = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
		this.newCoordonneeY = (int)(Math.random() * (HIGHER-LOWER)) + LOWER;
	 };

	protected double  calculDureeDeVie() {
		dureeDeVie = (double) (Math.random() * (DUREE_DE_VIE_MAX - DUREE_DE_VIE_MIN)) + DUREE_DE_VIE_MIN;
		return dureeDeVie;
	}
	
	protected Sexe setSexe(){
		if ((Math.random()*10)>5){
			return Sexe.FEMELLE;
		}
		return Sexe.MALE;
	}
	
//	protected boolean isParents(Animal b){
//		return (this.pere == b || this.mere == b);	
//	}
//	
//	protected void setParents(Animal papa, Animal maman){
//		this.pere = papa;
//		this.mere= maman;
//	}
//	
//	protected void setChildren(Animal a){
//		this.enfants.add(a);
//	}
//	
//	public boolean isChild(Animal b){
//		return (this.enfants.contains(b));	
//	}
//	
//	public boolean isBrother(Animal b){
//		return (this.enfants.contains(b));	
//	}
//	
//	boolean seReproduire(Animal a) {
//		return false;
//	}
	
}
