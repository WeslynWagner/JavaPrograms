import java.util.Scanner;
	class Second{
		public static void main(String[] args){
			String a = "hello";
			String b = "hello";
			String c = a; //pointing to same mem location as a and b
			
			String d = new String("hello"); //independent mem loc in the heap
			String e = new String("hello"); //independent mem loc in the heap
			
			System.out.println(" a == b : "+ (a==b));
			System.out.println(" a == c : "+ (a==c));
			System.out.println(" a == d : "+ (d.equals(e)));
			
		}
		
		
	}