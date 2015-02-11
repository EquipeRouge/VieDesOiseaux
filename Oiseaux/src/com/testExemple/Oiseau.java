package com.testExemple;

public class Oiseau {
	final static int DUREEVIE = 100;
	int naissance;
	Statut statut;
	
	
	Oiseau(int n, Statut s){
		naissance = n;
		statut =  s;
		
	}

	public static void main(String[] args){	
	
	Oeuf oeuf = new Oeuf("oeuf");
	Oiseau o1 = new Oiseau(20, oeuf );
	o1.statut = new Enfant("n");
	
	o1.statut.afficherStatut();
		
		
	}
}
