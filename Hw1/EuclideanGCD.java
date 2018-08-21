/*
 * September 10, 2016
 *Version 1.0
 *EE 5343 UTSA: Java Assignment #1
 *Student: Weslyn Wagner
 */
import java.util.Scanner;


class EuclideanGCD{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int a = input.nextInt();
	System.out.print("Enter the second number: ");
	int b = input.nextInt();
	
	int[] numbers = new int[]{a,b};
		if(a<b){
			numbers[0]= b;
			numbers[1]= a;
		}
	GCD(numbers[0],numbers[1]);
	}

	public static int GCD(int a, int b){
		int r;
		r = a%b;
		System.out.println("r is :"+r);
		if(r==0){
			System.out.println("The GCD is :"+ b);		
		}
		else{
			GCD(b,r);
		}	
	return b;
	}
}