import java.lang.Math.*;

class Sept29{
	public static void main(String[] args){
		Point a = new Point();
		a.display();
		Point b = new Point(4.0);
		b.display();
		Point c = new Point(4.0,5.0);
		c.display();
		System.out.println(b.distance(c));
	}
}


class Point{
	//member variables
	private double x;
	private double y;
	
	//constructors
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(double x){
		this.x = x;
		y = 0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//getters and setters
	public void set_x(double x){
		this.x=x;
	}
	public double get_x(){
		return x;
	}

	public void set_y(double b){
		y=b;
	}
	public double get_y(){
		return y;
	}

	//member methods
	public void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void display(){
		
		System.out.println("x= "+x +" | y = "+y);
	}
	
	public double distance(Point p){
		double dx = this.x-p.x;
		double dy = this.y-p.y;
		return Math.sqrt(Math.abs(dx*dx-dy*dy));
		
	}
}