package edu.handong.csee.java.lab07.prob2;	//package name

/**
 * Class
 * This class defines a Chicken object.
 * This class has overloading constructor(Chicken(), Chicken(String name, double price, int stars), getter and setter method.
 * There is constructor overloading.
 * 
 * Method
 * Chicken(): this method is constructor and initialize chicken's variable contents.
 * Chicken(String name, double price, int stars):this method is constructor and puts value in variable.
 * Getter: return value about Chicken class' variables
 * Setter: puts parameter value in the Chicken class' variables
 *  @author YuKyeongPark
 *
 */

public class Chicken {	//class is a blueprint of an object called Chicken
	private String name;	//private variable 'name' declaration
	private double price;	//private variable 'price' declaration
	private int stars;	//private variable 'stars' declaration

	//constructor is a initialize method which has same name with class and there is no return type 
	public Chicken()	//constructor, it exists as method in Chicken class
	{
		this.name = "";	//initialize name
		this.price = 0.0;	//initialize price	
		this.stars = 0;	//initialize stars
	}
	
	//Constructor Overloading
	public Chicken(String name, double price, int stars) //this is constructor which has parameters
	{
		this.name = name;	//puts value of parameter name -> name 
		this.price = price; //puts value of parameter price -> price
		this.stars = stars; //puts value of parameter stars -> stars
	}

	//Getter and Setter is used in order to blocking directional access 
	public String get_name()	//name getter method   
	{
		return this.name;	//returns name
	}
	
	public double get_price()	//price getter method 
	{
		return this.price;	//returns price
	}
	
	public int get_stars()	//stars getter method 
	{
		return this.stars;	//returns stars
	}
	
	public void set_name(String name)	//name setter method
	{
		this.name = name;	//puts parameter value in name
	}
	
	public void set_price(double price)	//price setter method
	{
		this.price = price;	//puts parameter value in price
	}

	public void set_stars(int stars)	//stars setter method
	{
		this.stars = stars;	//puts parameter value in stars
	}
}
