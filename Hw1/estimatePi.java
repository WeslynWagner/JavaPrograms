import java.util.Scanner;
import java.math.*;

class estimatePi{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the desired accuracy: ");
	double acc = input.nextDouble();
	System.out.println("Estimate for pi is: "+ estimate(acc));
	}
	
	public static double estimate(double acc){
		double numerator =4.0;
		double pi;
		double pi2;
		pi = 3.1415926535899793238462;
		pi2= numerator;
		double diff = Math.abs(pi-pi2);
		double iter = 2.0;
		
		while(diff>=acc){
			double j = 2*iter-1;
			if(iter%2==0){
				pi2= pi2-(numerator/j);
			}
			else{
				pi2= pi2+(numerator/j);
			}
			iter+=1.0;
			diff = Math.abs(pi-pi2);
		//System.out.println("Pi is: "+ pi);
		System.out.println("Pi2 is: "+ pi2);
		//System.out.println("The diff is: "+ diff);
		}
		return pi2;	
	}
}