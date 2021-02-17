package test;

import java.util.Scanner;

public class TryCatchScanner {
// ask a user what is your favorite number
// if user inputs anything other than a number give a prompt to user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your favorite number?");
		
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		System.out.println(number);
		
		try {
			int number = scan.nextInt();
			System.out.println(number);
		}catch(Exception e) {
			System.out.println("You must input a valid number!");
		}
	}

}
