/* Weslyn Wagner - zfs119
 * Sept8
 *
 * Version 1.0 2016/10/08
 *
 * EE 5343 UTSA 
 */
import java.lang.*;
 
class Planets {
	public static void main(String[] args) {
		//instantiate a new planet called earth
		Planet earth = new Planet("Earth",100,"green",true,1,5.9);
		//move earth a little closer to the sun
		earth.closerToSun(3);
		//move earth too close to the sun
		earth.closerToSun(4);
		//change its color to blue
		earth.changeColor("blue");
		//add some moons to the one that's already there
		earth.addMoons(2);
		//check and see if earth is visible
		System.out.println("Is earth visible?");
		System.out.println(earth.get_isVisible());
		//hide earth and check and see if it's visible
		earth.hide();
		System.out.println("Is earth visible?");
		System.out.println(earth.get_isVisible());
		//explode the earth
		earth.explode();

	}	
}

class Planet{
	//member variables 
	private String name;
	private double size;
	private String color;
	private boolean isVisible;
	private int moons;
	private double lightyearsFromSun;
	
	//constructors
	public Planet(){
		name = "";
		size = 0.0;
		color = "nuetral";
		isVisible = true;
		moons = 0;
		lightyearsFromSun = 0.0;
	}
	public Planet(String name){
		this.name =name;
		size = 0.0;
		color = "nuetral";
		isVisible = true;
		moons = 0;
		lightyearsFromSun = 0.0;
	}
	public Planet(String name, double size){
		this.name = name;
		this.size = size;
		color = "nuetral";
		isVisible = true;
		moons = 0;
		lightyearsFromSun = 0.0;
	}
	public Planet(String name, double size, String color){
		this.name = name;
		this.size = size;
		this.color = color;
		isVisible = true;
		moons = 0;
		lightyearsFromSun = 0.0;
	}
	public Planet(String name, double size, String color, boolean isVisible){
		this.name = name;
		this.size = size;
		this.color = color;
		this.isVisible = isVisible;
		moons = 0;
		lightyearsFromSun = 0.0;
	}
	public Planet(String name, double size, String color, boolean isVisible, int moons){
		this.name = name;
		this.size = size;
		this.color = color;
		this.isVisible = isVisible;
		this.moons = moons;
		lightyearsFromSun = 0.0;
	}	
	public Planet(String name, double size, String color, boolean isVisible, int moons, double lightyearsFromSun){
		this.name = name;
		this.size = size;
		this.color = color;
		this.isVisible = isVisible;
		this.moons = moons;
		this.lightyearsFromSun = lightyearsFromSun;
	}

	
	//getters & setters
	public void set_name(String name){
		this.name = name;
	}
	public String get_name(){
		return name;
	}	
	public void set_size(double size){
		this.size = size;
	}
	public double get_size(){
		return size;
	}
	public void set_color(String color){
		this.color = color;
	}
	public String get_color(){
		return color;
	}
	public void set_isVisible(boolean isVisible){
		this.isVisible = isVisible;
	}
	public boolean get_isVisible(){
		return isVisible;
	}
	public void set_moons(int moons){
		this.moons = moons;
	}
	public int get_moons(){
		return moons;
	}
	public void set_lightyearsFromSun(double lightyearsFromSun){
		this.lightyearsFromSun = lightyearsFromSun;
	}
	public double get_lightyearsFromSun(){
		return lightyearsFromSun;
	}
	
	//member methods
	public void explode(){
		int time = 10;
		while(time-->0){
			try{
			    Thread.sleep(1000);}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();}
			System.out.println(name +" will self destruct in "+time+" seconds!");
		}
		System.out.println("BOOM!");
		size = 0.0;
	}
	public void closerToSun(double x){
		if(lightyearsFromSun-x>0){
			lightyearsFromSun = lightyearsFromSun - x;
			System.out.println(name +" is "+lightyearsFromSun+ " lightyears from the sun");
		}	
		else{
			System.out.println("Warning, can't move that close to the Sun!");
		}	
	}
	public void changeColor(String color){
		this.color = color;
		System.out.println(name +" is now "+ color);	
	}
	public void addMoons(int m){
		moons = moons + m;
		System.out.println("you added "+m+" moons to "+ name);
		System.out.println("there are now "+moons+" moons");
	}
	public void hide(){
		isVisible = false;
		System.out.println(name+" is no longer visible");
	}
}