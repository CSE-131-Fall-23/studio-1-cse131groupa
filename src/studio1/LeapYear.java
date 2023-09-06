package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a year");
		Scanner in = new Scanner(System.in);
		
		int s1=in.nextInt(); 
		
		boolean div4 = (s1 % 4 == 0 && s1 % 100!= 0 );
		
		boolean ans = (div4 == true);
		
		System.out.println(ans);	
		

	}

}
