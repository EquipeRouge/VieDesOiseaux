package com.ressources;

import java.util.ArrayList;
import java.util.Iterator;

public class Famille {

	private Object enfant;
	private Famille pere;
	private Famille mere;
	private boolean vide;

	//--------------------------------
	// constructeurs
	//--------------------------------
	public Famille(){
		vide= true;

	} //constructeurs
	
//	public Famille(Object enfant){
//		vide= false;
//		this.enfant= enfant;
//		
//		pere= new Famille();
//		mere= new Famille();
//	} //constructeurs

	public Famille(Object enfant, Famille pere, Famille mere){
		vide= false;
		this.enfant= enfant;

// attention à la gestion du sexe
		this.pere= pere;
		this.mere= mere;
	} //constructeurs
	

	private void arbreToListeAvecRang(ArrayList<Object> pList, int pRang){
		if(!vide){

			pList.add(enfant);
			if(pRang >= 1){
				pRang--;
				pere.arbreToListeAvecRang(pList, pRang);
				mere.arbreToListeAvecRang(pList, pRang);
			}
		} //if
	} // void

	private void arbreToListe(ArrayList<Object> pList){
		if(!vide){

			pList.add(enfant);
			pere.arbreToListe(pList);
			mere.arbreToListe(pList);
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
	
//	public static void main(String[] args) {
//		Famille nfilsGauche= new Famille("aa", new Famille("bb"), new Famille("cc"));
//		Famille nfilsDroit= new Famille("dd", new Famille("ee"), new Famille("ff"));
//		Famille nGauche= new Famille("gg", nfilsGauche, nfilsDroit);
//		Famille nDroit= new Famille("hh", new Famille("ii"), new Famille("jj"));
//		Famille nArbreA= new Famille("kk", nGauche, nDroit);
//		
//		Famille nArbreX= new Famille("mm", nfilsGauche, new Famille("nn"));
////		Famille nArbreX= new Famille("mm", new Famille("xx"), new Famille("nn"));
//		Famille nArbreB= new Famille("zz", nArbreX, new Famille("yy"));
//
//		System.out.println((nArbreB.isInceste(nArbreA, 12))? "inceste": "ok");
//	}
}
