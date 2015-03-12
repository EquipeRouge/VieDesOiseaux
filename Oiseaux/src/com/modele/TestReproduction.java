package com.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReproduction {

	Oiseau creerOiseau(Sexe unSexe)
	{
		Oiseau temp = new Oiseau();
		temp.sexe = unSexe;
		return temp;
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
		
		assertFalse(oiseauMale.isReproductionOK(oiseauFemelle));
	}
	@Test
	public void testReproductionEntrePoussin()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);
		
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		assertFalse(oiseauMale.isReproductionOK(oiseauFemelle));
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
		
		assertTrue(oiseauMale.isReproductionOK(oiseauFemelle));
	}
	
	@Test
	public void testReproductionEntrePoussinEtAdulte()
	{
		Oiseau oiseauFemelle = creerOiseau(Sexe.FEMELLE);
		Oiseau oiseauMale = creerOiseau(Sexe.MALE);		
		
		oiseauMale.grandir(true);
		oiseauFemelle.grandir(true);
		oiseauMale.grandir(true);
		
		assertFalse(oiseauMale.isReproductionOK(oiseauFemelle));
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
				
		assertFalse(oiseauMale.isReproductionOK(oiseauFemelle));
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
