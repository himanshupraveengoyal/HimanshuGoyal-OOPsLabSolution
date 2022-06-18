package com.greatlearning.emailApp.services;

import java.util.Scanner;

public class MyConsole {
	
	static Scanner scan=new Scanner(System.in);
	
	//Print and take string input function
	public static String getStringInput(String message) {
		System.out.print(message);
		return scan.nextLine();
	}
	
	//Print and take int input function
		public static int getIntegerInput(String message) {
			System.out.print(message);
			return scan.nextInt();
		}
	
	//Print function
	public static void print(String message) {
		System.out.println(message);
	}

}
