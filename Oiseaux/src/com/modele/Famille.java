package com.modele;

import java.util.ArrayList;
import java.util.Iterator;

public class Famille {

	private Object enfant;
	private Famille parentA;
	private Famille parentB;
	private boolean vide;

	//--------------------------------
	// constructeurs
	//--------------------------------
	public Famille(){
		vide= true;

	} //constructeur

	public Famille(Object enfant, Famille parentA, Famille parentB){
		vide= false;
		this.enfant= enfant;

		this.parentA= parentA;
		this.parentB= parentB;
	} //constructeur
	

	private void arbreToListeAvecRang(ArrayList<Object> pList, int pRang){
		if(!vide){

			pList.add(enfant);
			if(pRang >= 1){
				pRang--;
				parentA.arbreToListeAvecRang(pList, pRang);
				parentB.arbreToListeAvecRang(pList, pRang);
			}
		} //if
	} // void

	private void arbreToListe(ArrayList<Object> pList){
		if(!vide){

			pList.add(enfant);
			parentA.arbreToListe(pList);
			parentB.arbreToListe(pList);
		} //if
	} // void

	public boolean isInceste(Famille pFamille, int pRang){
		
		boolean nReturn= true;
		while(true){
			if(this.chercherEnfantDansListe(pFamille.enfant)) break;
			
			if(pFamille.chercherEnfantDansListe(this.enfant)) break;
			
			if(this.incesteAvecRang(pFamille, pRang)) break;
			
			nReturn= false;
			break;
		} // while

		return nReturn;
	} // boolean
	
	private boolean chercherEnfantDansListe(Object pEnfant){

		ArrayList<Object> nList= new ArrayList<Object>();
		this.arbreToListe(nList);

		return (nList.contains(pEnfant));
	} // boolean

	private boolean incesteAvecRang(Famille pFamille, int pRang){
		boolean nReturn= false;
		
		ArrayList<Object> nListA= new ArrayList<Object>();
		ArrayList<Object> nListB= new ArrayList<Object>();

		this.arbreToListeAvecRang(nListA, pRang);
		pFamille.arbreToListeAvecRang(nListB, pRang);

		Iterator<Object> nItr = nListA.iterator();
		while (nItr.hasNext()) {
			Object nStr = nItr.next();
			
			nReturn= (nListB.contains(nStr));
			if(nReturn) break;

		} // while
		
		return nReturn;
	} // boolean
} // class
