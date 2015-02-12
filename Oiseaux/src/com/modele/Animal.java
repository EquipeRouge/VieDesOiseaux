package com.modele;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
	//Attributs
	double dureeDeVie;
	Date dateDeNaissance; //Sera mis � jour par la m�thode impl�ment� de l'interface reproduction
	double coordoneeX;  
	double coordoneeY;
	Animal pere;
	Animal mere;
	Sexe sexe;  //De mani�re � g�rer le sexe al�atoirement par un mathRandom() par la m�thode impl�ment� de l'interface reproduction
	//ArrayList <Animal> enfants;
	
	//M�thodes
	
	abstract void deplacement();
	
	abstract double calculDureeDeVie();
	
	
	
}
