/* Weslyn Wagner - zfs119
 * 11/3/2016
 *	
 * Version 1.0 
 *
 * EE 5343 UTSA ExamII
 */
import java.io.*;
import java.util.*;

class ResponseToSurvey{
	public static void main(String[] args) throws IOException  {	
		String outfile = "C:\\JavaPrograms\\Exam2\\Results.txt";
		ArrayList<Integer> responses = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int response = 10;
		int positive=0;
		int neutral=0;
		int negative=0;
		int numOfsub = 0;
		
		System.out.println("Would you recommend CoE in UTSA to a friend?");
		System.out.println("");
		System.out.println("Answer: 5. Definitely");
		System.out.println("Answer: 4. Most Probably");
		System.out.println("Answer: 3. Remain Neutral");
		System.out.println("Answer: 2. Most Probably Not");
		System.out.println("Answer: 1. Will Not Recommend");
		System.out.println("");
		System.out.println("Please enter a number 1-5. ***NOTE: Enter -1 to stop survey");
		System.out.println("");
		
		
		while (response != -1){
			System.out.println("Please enter a number 1-5");
			if(input.hasNextInt()!=true){
				System.out.println("You can only enter numbers! Stopping the survey here!");
				break;
			}
			else{
				response = input.nextInt();
				if (response <-1 || response >5 || response == 0){
				System.out.println("That is not a valid input. Try again!");
				System.out.println("");
				}
				
				else if(response != -1){
					responses.add(response);
					numOfsub+=1;
				}
				else{
					break;
				}
			
		}		

		}
		System.out.println("Entered numbers were:");

		for (int data : responses){
			System.out.println("	"+data);
			if(data>=4){
				positive+=1;
			}
			else if(data ==3){
				neutral+=1;
			}
			else{
				negative+=1;
			}			
		}
		System.out.println("");
		System.out.println("Summary is:");
		System.out.println("	Positive:"+positive);
		System.out.println("	Neutral:"+neutral);
		System.out.println("	Negative:"+negative);
		System.out.println("	No of submissions:"+numOfsub);
		
		
		
		try{
			
			FileWriter fwrite = new FileWriter(outfile);
			PrintWriter out = new PrintWriter(fwrite);
					
			out.println("Valid entries were:");

			for (int data : responses){
				out.println("	"+data);
				if(data>=4){
					positive+=1;
				}
				else if(data ==3){
					neutral+=1;
				}
				else{
					negative+=1;
				}			
			}
			out.println("");
			out.println("Summary is:");
			out.println("	Positive:"+positive);
			out.println("	Neutral:"+neutral);
			out.println("	Negative:"+negative);
			out.println("	No of submissions:"+numOfsub);
			
			out.close();			
		}
		catch (IOException f){
			System.out.println("Error "+ f);
		}	
		System.out.println("You can find the results here: "+outfile);
	}
}