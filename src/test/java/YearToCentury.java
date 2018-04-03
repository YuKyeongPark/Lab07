
public class YearToCentury {	//the method to change year to century
	int year;	//class variable
	
	public YearToCentury()	//method
	{
		year = 0;	//year initialization
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
