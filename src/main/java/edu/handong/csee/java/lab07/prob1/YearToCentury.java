package edu.handong.csee.java.lab07.prob1;	//package name

/**
 * Class
 * This class defines a YearToCentury object.
 * This class has YearToCentury(), YearToCentury(int year), calc_century() method.
 * There is a overloading method.
 * 
 * Method
 * YearToCentury(): method to initiate year
 * YearToCentury(int year): method to assign a int type value in class variable year.
 * calc_century(): method to calculate century
 * 
 * @author YuKyeongPark
 *
 */

public class YearToCentury {	//class is a blueprint of an object called YearToCentury
	int year;	//class variable
	
	public YearToCentury()	//method to initiate year
	{
		year = 0;	//initialization year variable
	}
	public YearToCentury(int year)	//overloading method
	{
		this.year = year;	//if year has int type value, assigns a value in class variable year
	}
	
	public int calc_century()	//method to calculate century
	{
		if(year%100==0)	//for example, if year is 1800,
			year = year/100;	// then 18th century
		else year = (year/100)+1; //else 18+1th century.
		return year;	//returns year converted to century
	}
}
