import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Polygon;

public class GUI {

    public static void main(String[] args) {
        System.out.println("Hello World, ");
        
        JFrame frame = new JFrame("My First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(500, 600);
        frame.setVisible(true);
		
    }
    
}

class ColorJPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.YELLOW);
        g.setColor(Color.GREEN);
		/*
        g.fillRect(10, 10, 80, 30);
        g.drawString("Green", 10, 50);
        g.setColor(new Color(255,0,0)); //RGB
        g.fillRect(110, 10, 80, 30);
        g.drawString("Red", 110, 50);
        g.setColor(new Color(0.5f,0.3f,0.2f)); //RGB
        g.fillRect(210, 10, 80, 30);
        g.drawString("Gold", 210, 50);
        g.drawRect(210, 100, 80, 30);
        g.drawArc(10, 300, 100, 100, 0, 90);
        g.drawArc(110, 300, 100, 100, 0, -90);
        g.drawArc(110, 300, 100, 100, 90, 90);
        
        int[] xVal = {100, 120, 140, 80};
        int[] yVal = {100, 150, 80, 40};        
        g.drawPolygon(xVal, yVal, 4);
        
        int[] xVal1 = {100, 120, 140, 80};
        int[] yVal1 = {100, 150, 80, 40};  
        Polygon p = new Polygon(xVal1, yVal1, 4);
        g.drawPolygon(p);
        
        g.setColor(Color.GREEN);
        Polygon p1 = new Polygon();
        p1.addPoint(20, 40);
        p1.addPoint(120, 80);
        p1.addPoint(220, 90);
        p1.addPoint(140, 60);
        g.drawPolygon(p1);       
        */
    }
}