package com.modele;

import java.util.*;

import com.ressources.*;

public abstract class Animal {

	final static double DUREE_DE_VIE_MAX = 1500;
	final static double DUREE_DE_VIE_MIN = 0;

	final static int HIGHERX = 750;
	final static int HIGHERY = 550;
	final static int LOWER = 0;

	// Attributs
	public int dureeDeVie;
	public int age;
	Date dateDeNaissance;
	int xInit = (int)(Math.random() * HIGHERX);
	int yInit = (int)(Math.random() * HIGHERY);
	int xFinal = (int)(Math.random() * HIGHERX);
	int yFinal = (int)(Math.random() * HIGHERY);
	Famille famille;
	
	public PointDeplaceable sonCorps;

	boolean isReproductible = false;

	List<Animal> enfants;

	Sexe sexe;

	// M�thodes

	

	protected int calculDureeDeVie() {
		dureeDeVie = (int) (Math.random() * DUREE_DE_VIE_MAX );
		return dureeDeVie;
	}

	protected Sexe setSexe() {
		if ((Math.random() * 10) > 5) {
			return Sexe.FEMELLE;
		}
		return Sexe.MALE;
	}

	abstract List<Animal> seReproduire(Animal a);
	
}
