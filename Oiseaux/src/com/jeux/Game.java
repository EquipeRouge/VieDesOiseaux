package com.jeux;

import javax.swing.JFrame;

import com.affichage.ScreenAWT;
import com.modele.Oiseau;

public class Game {

	public static void main(String[] args) {
		JFrame frame = new ScreenAWT();
		
		Oiseau vincent = new Oiseau();
		Oiseau ouarda = new Oiseau();
		Oiseau loic = new Oiseau();
		Oiseau cecile = new Oiseau();
		Oiseau karim = new Oiseau();
		Oiseau fabrice = new Oiseau();
		Oiseau seb = new Oiseau();
		Oiseau bertrand = new Oiseau();
		Oiseau loha = new Oiseau();
		

		
		((ScreenAWT)frame).sesOiseaux.add(vincent);
		((ScreenAWT)frame).sesOiseaux.add(ouarda);
		((ScreenAWT)frame).sesOiseaux.add(loic);
		((ScreenAWT)frame).sesOiseaux.add(cecile);
		((ScreenAWT)frame).sesOiseaux.add(karim);
		((ScreenAWT)frame).sesOiseaux.add(fabrice);
		((ScreenAWT)frame).sesOiseaux.add(seb);
		((ScreenAWT)frame).sesOiseaux.add(bertrand);
		((ScreenAWT)frame).sesOiseaux.add(loha);
	}
}
