import java.util.Scanner;

public class YearToCentury_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yr = 0;
		Scanner keyboard = new Scanner(System.in);	//user can input data
		System.out.println("Input year: ");
		yr = keyboard.nextInt();
		
		YearToCentury year = new YearToCentury(yr);
		System.out.println(year + " is " + year.calc_century() + "th century.");
	}

}
