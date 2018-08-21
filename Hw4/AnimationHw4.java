/*
 *
 * @author Weslyn Wagner - zfs119
 * Sept 16, 2016
 *
 * Version 1.0 2016/10/06
 *
 * EE 5343 UTSA 
 */

import java.awt.event.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.AffineTransform;

public class AnimationHw4 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("My First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(850, 700);
        frame.setVisible(true);   
    }
}

class ColorJPanel extends JPanel{
    int i = 0;
    int x = 0;
    int y  =327;
    Rectangle rect = new Rectangle(0,300,150,80);
    //Rectangle rect2 = new Rectangle(400,10,80,150);
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);
        
        g.drawLine(100, 0, 100, 200);
        g.drawLine(200, 0, 200, 200);
        g.drawLine(300, 0, 300, 200);
        g.drawLine(400, 0, 400, 200);
        g.drawLine(500, 0,500, 200);
        g.drawLine(600, 0,600, 200);
        g.drawLine(700, 0,700, 200);
               
        g.drawLine(100, 466, 100, 666);
        g.drawLine(200, 466, 200, 666);
        g.drawLine(300, 466, 300, 666);
        g.drawLine(400, 466, 400, 666);
        g.drawLine(500, 466, 500, 666);
        g.drawLine(600, 466, 600, 666);
        g.drawLine(700, 466, 700, 666);
       
        Graphics2D g2d = (Graphics2D)g;
        
        x = x + 1;
        if(x<400){
            g2d.translate(x, 0);
            x = x + 1;
        }
        else if(x<500 && i<90){
            g2d.translate(x, 0);
            i+=1; 
            //if (i>90) i = 0;
            //g2d.rotate(Math.toRadians(-i));
            g2d.rotate(Math.toRadians(-i),10,300);
        }
        else if (y>160){
        y = y - 1;
            g2d.translate(208, y);
            g2d.rotate(Math.toRadians(-90));
        }
        else{
            //The else loop executes, but I couldn't get it to 
            //paint a stagnant rectangle in the parking spot
            //Rectangle rect2 = new Rectangle(400,10,80,150);
        }
        g2d.setColor(Color.BLUE);
        g2d.fill(rect);
    }
    public ColorJPanel() {
        ActionListener animate = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                repaint(); 
            }
        };
        Timer timer = new Timer(10,animate);
        timer.start();
    }
}
