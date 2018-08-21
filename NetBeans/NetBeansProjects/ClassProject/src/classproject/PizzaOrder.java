
package classproject;

import java.awt.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * The PizzaOrder class contains the PizzaOrder object constructors, setters&getters,and member methods including:
 * AddTopping,CalculateCost,Order,Pickup, and Delivery. These are called from the Menu class
 */
public class PizzaOrder {
    public static String size;
    public static String crust;
    public static String cheese;
    public static ArrayList<String> toppings = new ArrayList<String>();
    
    //Constructors 
    public PizzaOrder(){
        cheese = "Mozzarrella";
        size = "Medium";
        crust = "Regular";
        toppings = null;
    }    
    
    public PizzaOrder(String size){
        cheese = "Mozzarrella";
        this.size = size;
        crust = "Regular";
        toppings = null;
    }
    
    public PizzaOrder(String size, String crust){
        cheese = "Mozzarrella";
        this.size = size;
        this.crust = crust;
        toppings = null;
    }
    
    public PizzaOrder(String size, String crust, String cheese){
        this.cheese = cheese;
        this.size = size;
        this.crust = crust;
        toppings = null;
    }
    
    public PizzaOrder(String size, String crust, String cheese, ArrayList<String> toppings){
        this.cheese = cheese;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }
    
    //getters and setters
    public void set_cheese(String cheese){
        this.cheese = cheese;
    }
    public void set_size(String size){
        this.size = size;
    }
    public void set_crust(String crust){
        this.crust = crust;
    }
    public static String get_cheese(){
        return cheese;
    }
    public static String get_size(){
        return size;
    }
    public static String get_crust(){
        return crust;
    }
    public static ArrayList<String> get_toppings(){
        return toppings;
    }
    
//Member Methods
        
    public static void AddTopping(String topping){
        if(ClassProject.availableToppings.contains(topping) != true){
            Component frame = null;
            JOptionPane.showMessageDialog(frame,"That topping is not available!","Topping Not Available",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(toppings.contains(topping) == true){
                Component frame = null;
                JOptionPane.showMessageDialog(frame,"This topping was already added!","Topping Already Added",JOptionPane.WARNING_MESSAGE);
            }
            else{
                toppings.add(topping);
            }      
        }      
    }
    
    public static BigDecimal CalculateCost(PizzaOrder p){
        double cost = 0.0;
        if(p.size == "Kids - $9.99"){
            cost += 9.99;
        }
        else if(p.size == "Regular - $12.99"){
            cost += 12.99;
        }
        else{
            cost += 14.99;
        }
        if(p.crust == "Cheesy - $1.75"){
            cost += 1.75;
        }
        else if(p.crust == "Crazy - $2.50"){
            cost += 2.50;
        }
        cost += toppings.size()*0.99;
        return new BigDecimal(String.valueOf(cost)).setScale(2, BigDecimal.ROUND_FLOOR);
    }
    
    public static String Order(PizzaOrder p){
        return "Your order has been placed! \n The total cost is: $"+ CalculateCost(p).toString();
    }
    
    public static String Pickup(){
        return "Your order will be ready for pickup in 20 minutes!";
    }
    
    public static String Deliver(String name, String address){
        return "Order for "+ name +" will be delivered to "+address;
    } 
}
