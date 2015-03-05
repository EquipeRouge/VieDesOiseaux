package com.deplacement;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Movement {
	
	public static void main(String[] args) {
	
		JFrame frame = new BounceFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
		
	}
}


class BounceFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private ComponentMovement comp;
	
	
	
	public static final int DELAY = 10;
	
	public static int hauteur_defaut = 500;
	public static int largeur_defaut = 600;
	public int duree = (int)(Math.random() * 5000);

	public BounceFrame() {
		setSize(largeur_defaut, hauteur_defaut);
		setTitle("Mouvement");

		comp = new ComponentMovement();
		add(comp, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		addButton(buttonPanel, "Start", new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				addBall();
			}
		});
		addButton(buttonPanel, "Close", new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		add(buttonPanel, BorderLayout.SOUTH);
	}

	public void addButton(Container c, String title, ActionListener listener) {
		JButton button = new JButton(title);
		c.add(button);
		button.addActionListener(listener);
	}

	public void addBall() {
		try {
			PointOiseau point = new PointOiseau();
			comp.add(point);

			for (int i = 1; i <= duree; i++) {
				point.move(comp.getBounds());
				comp.paint(comp.getGraphics());
				Thread.sleep(DELAY);
			}
		} catch (InterruptedException e) {
		}
	}

}


class ComponentMovement extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public void add(PointOiseau b) {
		balls.add(b);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // erase background
		Graphics2D g2 = (Graphics2D) g;
		for (PointOiseau b : balls) {
			g2.fill(b.getShape());
		}
	}

	private ArrayList<PointOiseau> balls = new ArrayList<PointOiseau>();
}


