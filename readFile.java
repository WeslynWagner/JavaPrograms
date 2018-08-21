import java.io.*;
import java.util.*;

class readFile{
	public static void main(String[] args) throws IOException  {	
		/*String infile = "C:\\eBooks\\abc.txt";
		String line;
		try{
			FileReader freader = new FileReader(infile);
			BufferedReader in = new BufferedReader(freader);
			
			while((line = in.readLine()) != null){
				System.out.println(line);
			}		
			
			in.close();		
		}
		catch (IOException f){
			System.out.println("Error "+ f);
		}*/
			
		int[][] marks = {{11,1,22},{4,6,5}};
		Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));
		

			
	}
}
