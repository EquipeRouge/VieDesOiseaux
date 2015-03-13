package com.modele;

import java.util.ArrayList;
import java.util.List;

public class Mort implements Statut {
	Oiseau oiseau;

	public Mort(Oiseau pOiseau) {
		this.oiseau = pOiseau;
		oiseau.isReproductible = false;
	}

	public boolean isReproductionOK(Animal a) {

		return false;
	}

	public ArrayList<Oiseau> seReproduire(Oiseau a) {

		return new ArrayList<Oiseau>();
	}

	public void grandir(boolean vivre) {
		if (!vivre)
			oiseau.setStatut(new Mort(oiseau));
	}

}
