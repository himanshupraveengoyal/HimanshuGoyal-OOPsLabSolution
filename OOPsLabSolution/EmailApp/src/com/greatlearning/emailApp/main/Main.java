package com.greatlearning.emailApp.main;
import com.greatlearning.emailApp.model.Employee;
import com.greatlearning.emailApp.services.*;

public class Main {
	
	public static void main(String[] args) {
		
		String firstName = MyConsole.getStringInput("Enter the First Name:");
		String lastName = MyConsole.getStringInput("Enter the Last Name:");
		MyConsole.print("Please Enter department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		int department=MyConsole.getIntegerInput("Enter your department:");
		
		if(department>4 || department<=0 )
		{
			MyConsole.print("Invalid Input \n"); 
			return;
		}
		
		Employee emp=new Employee(firstName, lastName);
		GenerateCredentials generateCredentials=new GenerateCredentials();
		generateCredentials.displayCredentials(department,emp);
	}
}
