package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 2 numbers");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		
		int n2 = in.nextInt();
		
		int average = (n1+n2)/2;
		
		System.out.println("Average is :" + average);
		
		

	}

}
