package com.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adulte implements Statut {

//	final static int RANG_FAMILLE = 5;
	
	Oiseau oiseau;
	
	// constructeur
	public Adulte(Oiseau pOiseau) {
		this.oiseau = pOiseau;
	}

	public boolean isReproductionOK(Animal a) {
		if (this.oiseau.sexe == a.sexe) return false;
			
		if (this.oiseau.getFamille().isInceste(((Oiseau)a).getFamille(), this.oiseau.getRangFamille()) ) return false;
		
		if (!this.oiseau.isReproductible) return false;
		
		if (!(a.isReproductible)) return false;
		
		return true;
	} // boolean

	public ArrayList<Oiseau> seReproduire(Oiseau a) {
		if (!isReproductionOK(a)) {
			throw new IllegalArgumentException("je peux pas dsl");
		}

		Random generateur = new Random();
		ArrayList<Oiseau> oeufs = new ArrayList<Oiseau>();

		int rand = generateur.nextInt(this.oiseau.getMaxOeufs() - 1);
		rand++;
		for (int i = 0; i < rand; i++) {
			//oeufs.add(new Oiseau(this. oiseau, (Oiseau) a));
			oeufs.add(new Oiseau(oiseau.getFamille(), ((Oiseau)(a)).getFamille()));
		}
		return oeufs;
	} // ArrayList<Oiseau>

	public void grandir(boolean vivre) {
		oiseau.setStatut(new Mort(oiseau));
	} // void

}
