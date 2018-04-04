package edu.handong.csee.java.lab07.prob3;	//package name
import java.util.Random;	//import Random class

/**
 * Class
 * This is a Attendance_main class.
 * This class has a main method.
 * 
 * Method 
 * main(): This is the main method that creates object and puts value in object's variable.
 * 		   According to conditions, prints informations and texts
 * When java file is compiled and executed, this main method is actually executed.
 * 
 * @author YuKyeongPark
 *
 */

public class Attendance_main {	//This class is a Attendance_main and has main method

	public static void main(String[] args) {	//main method
		// TODO Auto-generated method stub
		Random randomGen = new Random();	//constructor,creating object randomGen
		
		//two way to object creation
		//creating object s_1 and call Attendance method which has parameters
		Attendance s_1 = new Attendance("Jess", 4, "21400999", 0);	
		//creating object s_2 and call Attendance method which has parameters
		Attendance s_2 = new Attendance("Kent", 2, "21700111", 0);
		//creating object s_3 and call Attendance method(constructor)
		Attendance s_3 = new Attendance();
		//creating object s_4 and call Attendance method(constructor)
		Attendance s_4 = new Attendance();
		
		//setting s_3's variable using Attendance class
		s_3.setName("Lucas"); s_3.setYear(1); s_3.setStudent_id("21833222"); s_3.setMissed(0);
	
		//setting s_4's variable using Attendance class
		s_4.setName("Martha"); s_4.setYear(2); s_4.setStudent_id("21733444"); s_4.setMissed(0);

		s_1.setMissed(randomGen.nextInt(10));	//randomly assign the number of classes absent to s_1
		s_2.setMissed(randomGen.nextInt(10));	//randomly assign the number of classes absent to s_2
		s_3.setMissed(randomGen.nextInt(10));	//randomly assign the number of classes absent to s_3
		s_4.setMissed(randomGen.nextInt(10));	//randomly assign the number of classes absent to s_4

		
		//s_1
		if(s_1.getMissed()>6)	//if the number of s_1 absences is greater than 6, 
		{
			//announces "you failed this course"
			System.out.println("I¡¯m sorry, "+ s_1.getName() + " You failed this course");
			//prints name and the number of absence
			System.out.println(s_1.getName() + " - Number of absence: " + s_1.getMissed());
		}else //if the number of s_1 absences is smaller than 6
			System.out.println("We'll see about the grade, " + s_1.getName());	//prints texts
		
		//s_2
		if(s_2.getMissed()>6)	//if the number of s_2 absences is greater than 6,
		{
			//announces "you failed this course"
			System.out.println("I¡¯m sorry, "+ s_2.getName() + " You failed this course");
			//prints name and the number of absence
			System.out.println(s_2.getName() + " - Number of absence: " + s_2.getMissed());
		}else	//if the number of s_2 absences is smaller than 6
			System.out.println("We'll see about the grade, " + s_2.getName());	//prints texts
		
		//s_3
		if(s_3.getMissed()>6)	//if the number of s_3 absences is greater than 6,
		{
			//announces "you failed this course"
			System.out.println("I¡¯m sorry, "+ s_3.getName() + " You failed this course");
			//prints name and the number of absence
			System.out.println(s_3.getName() + " - Number of absence: " + s_3.getMissed());
		}else	//if the number of s_3 absences is smaller than 6
			System.out.println("We'll see about the grade, " + s_3.getName());	//prints texts
		
		//s_4
		if(s_4.getMissed()>6)	//if the number of s_4 absences is greater than 6,
		{
			//announces "you failed this course"
			System.out.println("I¡¯m sorry, "+ s_4.getName() + " You failed this course");
			//prints name and the number of absence
			System.out.println(s_4.getName() + " - Number of absence: " + s_4.getMissed());
		}else	//if the number of s_4 absences is smaller than 6
			System.out.println("We'll see about the grade, " + s_4.getName());	//prints texts
		
	}

}
