package com.deplacement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

import javax.swing.*;

public class TestMove extends JPanel {

	private static final long serialVersionUID = 1L;

	// Taille de la fenetre
	private static final int BOX_WIDTH = 640;
	private static final int BOX_HEIGHT = 480;

	// Ball's properties
	private float ballRadius = 5; // Ball's radius
	private float ballX = ballRadius + 30; // Ball's center (x, y)
	private float ballY = ballRadius + 30; 
	private float ballSpeedX = (float)(-10 + (Math.random()*20));   
	private float ballSpeedY = (float)(-10 + (Math.random()*20));

	private static final int UPDATE_RATE = 10; // Number of refresh per second

	// Constructeur de l'objet point et des composants
	public TestMove() {
		this.setPreferredSize(new Dimension(BOX_WIDTH, BOX_HEIGHT));

		// Demarrer le mouvement
		Thread gameThread = new Thread() {
			public void run() {
				while (true) { 
					// Calcul de la position du point
					ballX += ballSpeedX;
					ballY += ballSpeedY;
					
					// Verifier quand le point arrive au bord G ou D
					if (ballX - ballRadius < 0) {
//						ballSpeedX = -ballSpeedX ;
						ballSpeedX = (float)(-5 + (Math.random()*10));
						ballX = ballRadius; // Repositionner direction
					} else if (ballX + ballRadius > BOX_WIDTH) {
//						ballSpeedX = -ballSpeedX ;
						ballSpeedX = (float)(-5 + (Math.random()*10));
						ballX = BOX_WIDTH - ballRadius;
					}
					// Cas ou le point arrive au bord H ou B
					if (ballY - ballRadius < 0) {
//						ballSpeedY = -ballSpeedY ;
						ballSpeedY = (float)(-5 + (Math.random()*10));
						ballY = ballRadius;
					} else if (ballY + ballRadius > BOX_HEIGHT) {
//						ballSpeedY = -ballSpeedY ;
						ballSpeedY = (float)(-5 + (Math.random()*10));
						ballY = BOX_HEIGHT - ballRadius;
					}
					// Rafraichissement de l'ecran
					repaint(); 
					// 
					try {
						Thread.sleep(1000 / UPDATE_RATE);  // milliseconds
					} catch (InterruptedException ex) { }
				}
			}
		};
		gameThread.start();  // Callback run()
	}

	// Construction du Panel
	public void paintComponent(Graphics g) {
		super.paintComponent(g);    // Paint background

		// Draw the box
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, BOX_WIDTH, BOX_HEIGHT);

		// Draw the ball
		g.setColor(Color.BLUE);
		g.fillOval((int) (ballX - ballRadius), (int) (ballY - ballRadius),
				(int)(2 * ballRadius), (int)(2 * ballRadius));

		// Display the ball's information
		g.setColor(Color.WHITE);
		g.setFont(new Font("Courier New", Font.PLAIN, 12));
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		formatter.format("Ball @(%3.0f,%3.0f) Speed=(%2.0f,%2.0f)", ballX, ballY, ballSpeedX, ballSpeedY);
		g.drawString(sb.toString(), 20, 30);
	}

	/** main program (entry point) */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("A Bouncing Ball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TestMove());
		frame.pack();
		frame.setVisible(true);	
	}
}
