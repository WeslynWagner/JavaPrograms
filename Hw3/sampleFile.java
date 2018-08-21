/* Weslyn Wagner - zfs119
 * Sept8
 *
 * Version 1.0 2016/10/08
 *
 * EE 5343 UTSA 
 */
import java.io.*;
import java.util.*;

class sampleFile{
	public static void main(String[] args) throws IOException  {	
		String infile = "C:\\JavaTextFiles\\SampleFile.txt";
		String line;
		int len;
		String timeval;
		String totval;
		String conval;
		String outfile = "C:\\JavaTextFiles\\OutFile.txt";
		String write = "time, tot_iter, conv_iter";
		
		try{
			FileReader freader = new FileReader(infile);
			BufferedReader in = new BufferedReader(freader);
			
			
			FileWriter fwrite = new FileWriter(outfile);
			PrintWriter out = new PrintWriter(fwrite);
			
			//System.out.println("time,"+" "+"tot_iter,"+" "+"conv_iter");
			out.println(write);
			while((line = in.readLine()) != null){
				if(line.contains("tran: time")){
					line.trim();
					len = line.length();
					//there are 63 chars
					timeval = line.substring(13,24);
					totval = line.substring(39,42);
					conval = line.substring(60);
					out.println(timeval+", "+totval+", "+conval);	
				}
			}		
			in.close();
			out.close();			
		}
		catch (IOException f){
			System.out.println("Error "+ f);
		}	
		System.out.println("file successfully created in: "+outfile);
	}
}