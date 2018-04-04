package edu.handong.csee.java.lab07.prob2;	//package name
import edu.handong.csee.java.lab07.prob2.Chicken;	//import Chicken class

/**
 * Class
 * This is a Chicken_main class.
 * This class has a main method.
 * 
 * Method 
 * main(): This is the main method that loads Chicken class and prints Chicken information.
 * When java file is compiled and executed, this main method is actually executed.
 * 
 * @author YuKyeongPark
 *
 */

public class Chicken_main {	//This class is a Chicken_main and has main method
	public static void main(String[] args) {	//main method
		//creating object menu1 and call Chicken method which has parameters
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);
		//creating object menu2 and call Chicken method which has parameters
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);
		//creating object menu3 and call Chicken method which has parameters
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);
		
		menu1.set_stars(3);	//calls Chicken class's method set_stars and sets value of stars to 3 
		menu2.set_stars(4);	//calls Chicken class's method set_stars and sets value of stars to 4
		menu3.set_stars(1);	//calls Chicken class's method set_stars and sets value of stars to 1
		
		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());	//calls Chicken method and prints menu1's information
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());	//calls Chicken method and prints menu2's information
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());	//calls Chicken method and prints menu3's information
	}

}
