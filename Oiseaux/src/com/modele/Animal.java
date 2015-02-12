package com.modele;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
	//Attributs
	double dureeDeVie;
	Date dateDeNaissance; //Sera mis à jour par la méthode implémenté de l'interface reproduction
	double coordoneeX;  
	double coordoneeY;
	Animal pere;
	Animal mere;
	Sexe sexe;  //De manière à gérer le sexe aléatoirement par un mathRandom() par la méthode implémenté de l'interface reproduction
	//ArrayList <Animal> enfants;
	
	//Méthodes
	
	abstract void deplacement();
	
	abstract double calculDureeDeVie();
	
	
	
}
