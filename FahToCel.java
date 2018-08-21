import java.io.*;

class FahToCel{
	public static void main(String[] args){
		//System.out.println("You entered: "+args[0]);
		int tempF = Integer.parseInt(args[0]);
		System.out.println("The temp in F is : "+tempF);
		int tempC = ((tempF - 32)*5)/9;
		System.out.println("The temp in Celsius is: "+tempC);
	}
}