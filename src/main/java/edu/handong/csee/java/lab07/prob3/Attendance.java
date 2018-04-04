package edu.handong.csee.java.lab07.prob3;	//package name

/**
 * Class
 * This class defines a Attendance object.
 * This class has constructor overloading(Chicken(), Chicken(String name, double price, int stars), getter and setter method.
 * There is constructor overloading.
 * 
 * Method
 * Attendance(): this method is constructor and initialize class variable contents.
 * Attendance(String name, int year, String student_id, int missed):this method is constructor and puts value in variable.
 * Getter: return value about Attendance class' variables
 * Setter: puts parameter value in the Attendance class' variables
 *  
 * @author YuKyeongPark
 *
 */

public class Attendance {	//class is a blueprint of an object called Attendance
	private String name = "";	//declares and initializes class variable 'name' which is private string type
	private int year = 0;	//declares and initializes class variable 'year' which is private int type
	private String student_id = "";	//declares and initializes class variable 'student_id' which is private string type
	private int missed = 0;	//declares and initializes class variable 'missed' which is private int type
	
	public Attendance()	//constructor, it exists as method in Attendance class
	{
		this.name = "NULL";	//initiates name
		this.year = 0;		//initiates year
		this.student_id = "NULL";	//initiates student_id
		this.missed = 0;	//initiates missed
	}
	
	//constructor overloading 
	public Attendance(String name, int year, String student_id, int missed)	//this is constructor which has parameters
	{
		this.name = name;	//puts value of parameter name -> name 
		this.year = year;	//puts value of parameter year -> year 
		this.student_id = student_id;	//puts value of parameter student_id -> student_id 
		this.missed = missed;	//puts value of parameter missed -> missed
	}

	//Getters
	public String getName() {	//name getter method 
		return name;	//returns name
	}

	public int getYear() {	//year getter method
		return year;	//returns year
	}
	
	public String getStudent_id() {	//student_id getter method
		return student_id;	//returns student_id
	}

	public int getMissed() {	//missed getter method
		return missed;	//returns missed
	}
	
	//Setters
	public void setName(String name) {	//name setter method
		this.name = name;	//puts parameter value in name
	}

	public void setYear(int year) {	//year setter method
		this.year = year;	//puts parameter value in year
	}

	public void setStudent_id(String student_id) {	//student_id setter method
		this.student_id = student_id;	//puts parameter value in student_id
	}

	public void setMissed(int missed) {	//missed setter method
		this.missed = missed;	//puts parameter value in missed
	}
	
	
}
