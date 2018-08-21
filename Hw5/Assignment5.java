/*
	EE5453: Weslyn Wagner (zfs119)
	Assignment 5 - Version 1.0
	11/1/2016

*/

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
//This class is called in Assignment5.html from C:\HTML\

public class Assignment5 extends Applet{

    public void paint(Graphics g) {        
		//Setting the background color and filling it
		g.setColor(Color.darkGray);
		g.fillRect(0,0,500,500);
		//Setting the color of the card and filling it
		g.setColor(Color.white);
		g.fillRoundRect(100,50,300,400,20,20);
		//Setting the color of the letters and symbols
		//on the card and creating them
		g.setColor(Color.red);
		Font f = new Font("Helvetica", Font.BOLD,40);
		g.setFont(f);
        g.drawString("A", 125, 100);
		g.drawString("A", 350, 425);
		
		int [ ] x = {175,325,250};
		int [ ] y = {195,195,300};
		g.fillPolygon(x, y, 3);
		g.fillArc(175, 150, 75, 95, 0, 180);
		g.fillArc(250, 150, 75, 95, 0, 180);
		//Outlining the card with blue border
		g.setColor(Color.blue);
		g.drawRoundRect(100,50,300,400,20,20);

	}
}