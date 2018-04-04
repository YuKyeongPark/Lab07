package edu.handong.csee.java.lab07.prob1;	//package name
import java.util.Scanner;	//calling  Scanner class
//import edu.handong.csee.java.lab07.prob1.YearToCentury;

/**
 * Class
 * This is a YearToCentury_main class.
 * This class has a main method.
 * 
 * Method 
 * main(): This is the main method that loads and prints YearToCentury methods that change year to century
 * When java file is compiled and executed, this main method is actually executed.
 * 
 * @author YuKyeongPark
 *
 */

public class YearToCentury_main {	//This class is a YearToCentury_main and has main method

	
	public static void main(String[] args) {	//main method
		// TODO Auto-generated method stub
		int yr = 0;	//initiation yr 
		Scanner keyboard = new Scanner(System.in);	//user can input data
		System.out.println("Input year: ");	//prints text
		yr = keyboard.nextInt();	//user could input data in yr
		
		//new YearToCentury: creates instance / YearToCentury(yr): calls constructor 
		YearToCentury year = new YearToCentury(yr);	//creating object year and call YearToCentury
		System.out.println(yr + " is " + year.calc_century() + "th century.");	//prints result
	}

}

