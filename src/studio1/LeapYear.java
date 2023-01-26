package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        boolean leapYear;
        System.out.println("What is the year?");
        int leapYear1 = in.nextInt();
        leapYear = ((leapYear1 % 4 == 0) && (leapYear1 % 100 != 0)) || (leapYear1 % 400 == 0); 
        System.out.println(leapYear1 + " is a leap year: " + leapYear);
	}

}