package com.affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.modele.Animal;
import com.modele.Oiseau;
import com.ressources.PointDeplaceable;

public class ScreenAWT extends JFrame {
	
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
	public static final int DELAY = 5;
=======
	public static final int DELAY = 15;
>>>>>>> refs/remotes/origin/dev
	
	public static int screenX= 650;
	public static int screenY = 800;
	public static int dureeJeu = 2000;
	
	private ComposantDeplacement comp;
	
	public ArrayList<Oiseau> sesOiseaux;
	
	public ScreenAWT(){
		
		sesOiseaux = new ArrayList<Oiseau>();
		
		comp = new ComposantDeplacement();
		
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Demarrer", demarrer); 
		add(buttonPanel, BorderLayout.SOUTH);
		comp.setBackground(Color.decode("#B0E4E8"));
		
		setSize(screenY, screenX);
		setTitle("La vie des Oiseaux");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}
	
	ActionListener demarrer = new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			debuterMouvement(sesOiseaux);
		}
	};
	
	
	
//	public void debuterMouvement() {
//		for (int i = 0; i < sesOiseaux.size(); i++){
//			try {
//				comp.add(this.sesOiseaux.get(i).sonCorps);
//	
//				this.sesOiseaux.get(i).faireEvoluer();
//				for (int j = 1; j <= this.sesOiseaux.get(i).dureeDeVie; j++) {
//					sesOiseaux.get(i).sonCorps.deplacer(sesOiseaux.get(i).vitesse);
//
//					System.out.println(sesOiseaux.get(i).sonCorps.getxInit() + "= x");
//					System.out.println(sesOiseaux.get(i).sonCorps.getyInit() + "= y");
//					System.out.println(sesOiseaux.get(i).sonCorps.getxFinal() + "= xFinal");
//					System.out.println(sesOiseaux.get(i).sonCorps.getyFinal() + "= yFinal");
//					comp.paint(comp.getGraphics());
//					Thread.sleep(DELAY);
//				}
//			} 
//			catch (InterruptedException e) {
//			}
//		}
//	}
	
	public void debuterMouvement(ArrayList<Oiseau> pOiseaux) {
		for (int j = 1; j <= dureeJeu; j++) {
<<<<<<< HEAD
			for (int i = 0; i < sesOiseaux.size(); i++){
				
				comp.add(this.sesOiseaux.get(i).sonCorps);
				this.sesOiseaux.get(i).definirVitesse();
				sesOiseaux.get(i).sonCorps.deplacer(5);
				this.sesOiseaux.get(i).faireEvoluer();
		
=======
			for (int i = 0; i < pOiseaux.size(); i++){
				comp.add(pOiseaux.get(i).sonCorps);
				pOiseaux.get(i).definirVitesse();
	//			sesOiseaux.get(i).sonCorps.deplacer(sesOiseaux.get(i).definirVitesse());
				pOiseaux.get(i).sonCorps.deplacer(5);
				pOiseaux.get(i).faireEvoluer();

				Iterator<Oiseau> nItr = pOiseaux.iterator();
				while (nItr.hasNext()) {
					Oiseau nOiseau = nItr.next();
					if(!nOiseau.equals(pOiseaux.get(i))){
						
						double nMarge= 10.0;
						while(true){
							double nX= pOiseaux.get(i).sonCorps.getxInit();
							double nXmin= (nX <= nMarge)? 0 : nX-nMarge;
							double nXmax= nX+nMarge;

							double nY= pOiseaux.get(i).sonCorps.getyInit();
							double nYmin= (nY <= nMarge)? 0 : nY-nMarge;
							double nYmax= nY+nMarge;
							
							if((nOiseau.sonCorps.getxInit()<nXmin) && (nOiseau.sonCorps.getxInit()<nXmax)) break;
							
							if((nOiseau.sonCorps.getyInit()<nYmin) && (nOiseau.sonCorps.getyInit()<nYmax)) break;

							ArrayList<Oiseau> nNaissance= new ArrayList<Oiseau>();
							nNaissance= pOiseaux.get(i).getStatut().seReproduire(nOiseau);

							debuterMouvement(nNaissance);
//							Iterator<Oiseau> nOeuf = nNaissance.iterator();
//							while (nOeuf.hasNext()) {
//								sesOiseaux.add(nOeuf.next());
//							} // while

							break;
						} // while

					}
				} // while
				
>>>>>>> refs/remotes/origin/dev
				System.out.println(sesOiseaux.get(i).sonCorps.getxInit() + "= x");
				System.out.println(sesOiseaux.get(i).sonCorps.getyInit() + "= y");
//				System.out.println(sesOiseaux.get(i).sonCorps.getxFinal() + "= xFinal");
//				System.out.println(sesOiseaux.get(i).sonCorps.getyFinal() + "= yFinal");
				comp.paint(comp.getGraphics());
				try {
					Thread.sleep(DELAY);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
		

	
	class ComposantDeplacement extends JPanel {
		
		private static final long serialVersionUID = 1L;

		private ArrayList<PointDeplaceable> points = new ArrayList<PointDeplaceable>();

		public void add(PointDeplaceable ptd) {
			points.add(ptd);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g); // erase background
			Graphics2D g2 = (Graphics2D) g;
			for (PointDeplaceable ptd : points) {
				g2.setColor(Color.RED);
				g2.fill(ptd.getForme());
			}
		}

	}

}
