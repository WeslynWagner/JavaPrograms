/*
 * Project by Weslyn Wagner - zfs119
 */
package classproject;

/**
 *
 * This is the main class for the ClassProject application
 */
import java.io.*;
import java.util.*;

public class ClassProject {

    //Handle the input .txt file from the specified location 
    private static String infile = "C:\\JavaPrograms\\NetBeans\\NetBeansProjects\\ClassProject\\src\\classproject\\AvailableToppings.txt";
    private static String line;
    public static ArrayList<String> availableToppings = new ArrayList<String>();
    
    public static void main(String[] args) throws IOException  {	
        //Read the input file and store available toppings
	try{
            FileReader freader = new FileReader(infile);
            BufferedReader in = new BufferedReader(freader);
            
            while((line = in.readLine()) != null){
                System.out.println(line);
                availableToppings.add(line);   
            }		
	in.close();			
	}
	catch (IOException f){
            System.out.println("Error "+ f);
	}
        //Initialize the menu GUI
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}


    
    

