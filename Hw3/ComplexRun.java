/* Weslyn Wagner - zfs119
 * Sept8
 *
 * Version 1.0 2016/10/08
 *
 * EE 5343 UTSA 
 */
import java.lang.Math.*;
 

class ComplexRun{
	public static void main(String[] args){
		//instantiate some new Complex members
		Complex one = new Complex();
		Complex two = new Complex(1.0);
		Complex three = new Complex(1.0,-2.0);
		Complex four = new Complex(1.0,2.0);
		Complex five = new Complex(3.0,4.0);
		Complex six = new Complex(0.0,4.0);
		//test out the Complex class member methods
		one.display();
		System.out.println("this is mag: "+ three.magnitude());
		System.out.println("Is two real? "+ two.isReal());
		System.out.println("Is four real? "+ four.isReal());
		System.out.println("Is two imag? "+ two.isImaginary());
		System.out.println("Is six imag? "+ six.isImaginary());
		System.out.println("five's conjugate: ");
		five.conjugate();
		System.out.println("three's conjugate: ");
		three.conjugate();
		System.out.println("does one eqaul two? "+ one.equals(two));
		System.out.println("does three equal four? "+ three.equals(four));
		System.out.println("add ");
		three.add(five);
		System.out.println("subtract ");
		three.subtract(five);
		System.out.println("multiply ");
		three.multiply(five);
		System.out.println("divide ");
		three.divide(five);
		
	}
}

class Complex{
	//member variables
	private double real;
	private double imag;
	
	//constructors
	public Complex(){
		real = 0.0;
		imag = 0.0;
	}
	public Complex(double real){
		this.real = real;
		imag = 0.0;
	}
	public Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	//getters & setters
	public void set_real(double real){
		this.real = real;
	}
	public double get_real(){
		return real;
	}	
	public void set_imag(double imag){
		this.imag = imag;
	}
	public double get_imag(){
		return imag;
	}
	
	//member methods
	private double i;
	private double j;
	
	public void display(){
		System.out.println(real+" + "+imag+"j");
	}
	public double magnitude(){
		double i = this.real;
		double j = this.imag;
		return Math.sqrt((i*i)+(j*j));
	}
	public boolean isReal(){
		if(this.real != 0 && this.imag ==0){
		return true;}
		else{return false;}
		}
	public boolean isImaginary(){
		if(this.real == 0 && this.imag !=0){
		return true;}
		else{return false;}
	}
	public void conjugate(){
		if(-1*imag<0){
			System.out.println(real+" - "+Math.abs((-1*imag))+"j");
		}
		else{
			System.out.println(real+" + "+Math.abs((-1*imag))+"j");
		}
	}
	public boolean equals(Complex p){
		boolean test;
		if(this.real == p.real && this.imag == p.imag){
			test = true;
		}
		else{test = false;}
		return test;
	}
	public void add(Complex p){
		i = this.real + p.real;
		j = this.imag + p.imag;
		System.out.println(i+" + "+j+"j");
	}
	public void subtract(Complex p){
	i = this.real - p.real;		
	j = this.imag - p.imag;
	System.out.println(i+" + "+j+"j");
	}
	public void multiply(Complex p){
		i = this.real*p.real - this.imag*p.imag;
		j = this.imag*p.real + this.real*p.imag;
		System.out.println(i+" + "+j+"j");
	}
	public void divide(Complex p){
		i= (this.real*p.real + this.imag*p.imag)/((p.real*p.real)+(p.imag*p.imag));
		j= (this.imag*p.real - this.real*p.imag)/((p.real*p.real)+(p.imag*p.imag));
	System.out.println(i+" + "+j+"j");
	}
	
}