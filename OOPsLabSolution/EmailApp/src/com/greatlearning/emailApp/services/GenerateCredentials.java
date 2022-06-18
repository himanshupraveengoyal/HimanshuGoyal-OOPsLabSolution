package com.greatlearning.emailApp.services;
import java.util.Random;

import com.greatlearning.emailApp.model.*;

public class GenerateCredentials {
	
	/// Generate Email Address
	public String generateEmailCredentials(Employee emp,int department) {
		return emp.getFirstName().toLowerCase() + "." + emp.getLastName().toLowerCase() + "@"+getDepartment(department)+".himanshugroup.com";
	}
	
	///Get Department name According to department id
	private String getDepartment(int department)
	{
		switch (department) {
		case 1:  return "tech";
		case 2: return "admin";
		case 3: return "hr";
		case 4: return "legal";
		default:
			return "";
		}
	}
	
	///Generate Password
	public String generatePasswordCredentials() {
		Random random=new Random();
		String randomPassword="";
		String capitalLetters = "QWERTYUIOPASDFGJKLZCVNM";
		String lowerLetters = "qwertyuiopasdfgjklzcvnm";
		String numbers = "7412589630";
		String specialCharacters="@!#$";
		switch (random.nextInt(1,4)) {
		case 1: {
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=lowerLetters.charAt(random.nextInt(0,lowerLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=specialCharacters.charAt(random.nextInt(0,specialCharacters.length()));
			break;
		}
		case 2: {
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=specialCharacters.charAt(random.nextInt(0,specialCharacters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=lowerLetters.charAt(random.nextInt(0,lowerLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			break;
		}
		case 3: {
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=lowerLetters.charAt(random.nextInt(0,lowerLetters.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=specialCharacters.charAt(random.nextInt(0,specialCharacters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			break;
		}
		case 4: {
			randomPassword+=lowerLetters.charAt(random.nextInt(0,lowerLetters.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=specialCharacters.charAt(random.nextInt(0,specialCharacters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			randomPassword+=capitalLetters.charAt(random.nextInt(0,capitalLetters.length()));
			randomPassword+=numbers.charAt(random.nextInt(0,numbers.length()));
			
			break;
		}
		default:
			break;
		}
		return randomPassword;
	}
	
	public void displayCredentials(int department,Employee emp) {
		MyConsole.print("Dear "+emp.getFirstName()+" your generated credentials are as follows:");
		MyConsole.print("Email     ---->"+ generateEmailCredentials(emp, department));
		MyConsole.print("Password  ---->"+ generatePasswordCredentials());
	}
	
}
