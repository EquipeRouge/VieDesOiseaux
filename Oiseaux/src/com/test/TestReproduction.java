package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.modele.Oiseau;
import com.modele.Sexe;

public class TestReproduction {

	Oiseau creerOiseau(Sexe pSexe)
	{
		Oiseau nOiseau = new Oiseau();
		nOiseau.setSexe(pSexe);
		return nOiseau;
	}
	
	@Test
	public void testSexe(){
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);
		
		assertTrue(oiseauMale.isSexeOk(oiseauFemelle));
		/*
//		A.showStatut();
//		A.grandir(true);
//		A.showStatut();
//		A.grandir(true);
//		A.showStatut();
//		A.grandir(true);
//		A.showStatut();
	A.faireEvoluer();
	//System.out.println(A);
	//A.seReproduire(B);
	System.out.println(A.getSex());
	System.out.println(B.getSex());*/
	}
	
	@Test
	public void testReproductionEntreOeuf()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);
		
		assertFalse(oiseauMale.getStatut().isReproductionOK(oiseauFemelle));
	}
	@Test
	public void testReproductionEntrePoussin()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);
		
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		assertFalse(oiseauMale.getStatut().isReproductionOK(oiseauFemelle));
	}
	@Test
	public void testReproductionEntreAdulte()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);
		
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		
		assertTrue(oiseauMale.getStatut().isReproductionOK(oiseauFemelle));
	}
	
	@Test
	public void testReproductionEntrePoussinEtAdulte()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);		
		
		oiseauMale.grandir(true);
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		
		assertFalse(oiseauMale.getStatut().isReproductionOK(oiseauFemelle));
	}
	@Test
	public void testReproductionEntreAdulteEtMort()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);		
		
		oiseauMale.grandir(true);
		oiseauMale.grandir(true);
		oiseauMale.grandir(false);
		oiseauFemelle.grandir(true);
		oiseauFemelle.grandir(true);
				
		assertFalse(oiseauMale.getStatut().isReproductionOK(oiseauFemelle));
	}
	
	
	@Test
	public void testSeReproduire_valide()
	{
		int assez = 1000;
		for (int i = 0 ; i < assez ; i++)
		{
			Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
			Oiseau oiseauMale = creerOiseau(Sexe.MALE);		
			
			oiseauMale.grandir(true);
			oiseauMale.grandir(true);
			oiseauFemelle.grandir(true);
			oiseauFemelle.grandir(true);
			
			assertTrue(oiseauMale.seReproduire(oiseauFemelle) != null);

			assertFalse(oiseauMale.seReproduire(oiseauFemelle).isEmpty());
		}
	}
	
	
}
