package com.capgemini.urpjt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);
	
	public boolean firstNameValidator(String firstName) {
		//System.out.println("Enter your First Name");
		//System.out.println("First Name should start with uppercase and have min 3 characters");
		//String firstName = sc.nextLine();
		Pattern pattern = Pattern.compile("^([A-Z])[A-Za-z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		boolean b = matcher.find();
		if (b)
			System.out.println("First Name is validated");
		else
			System.out.println("Please enter correct First Name");
		return b;
	}
	
	public boolean lastNameValidator(String lastName) {
		//System.out.println("Enter your Last Name");
		//System.out.println("Last Name should start with uppercase and have min 3 characters");
		//String lastName = sc.nextLine();
		Pattern pattern = Pattern.compile("^([A-Z])[A-Za-z]{2,}");
		Matcher matcher = pattern.matcher(lastName);
		boolean b = matcher.find();
		if (b)
			System.out.println("Last Name is validated");
		else
			System.out.println("Please enter correct Last Name");
		return b;
	}
	
	public boolean emailIdValidator(String emailId) {
		//System.out.println("Enter your email id");
		//String emailId = sc.nextLine();
		Pattern pattern = Pattern.compile("^([a-z]){1,}[a-z0-9]*([+_-]){0,1}[a-z0-9]+(@)([a-z0-9]+)(\\.[a-z]{2,3}){1}(\\.[a-z]{2})?$");
		Matcher matcher = pattern.matcher(emailId);
		boolean b = matcher.find();
		if (b)
			System.out.println("Email Id is validated");
		else
			System.out.println("Please enter correct Email Id");
		return b;
	}

	public boolean mobileNoValidator(String mobileNo) {
		//System.out.println("Enter your Mobile No :");
		//String mobileNo = sc.nextLine();
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNo);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Mobile No is Validated");
		else
			System.out.println("Please enter the correct mobile no");
		return b;
	}

	public boolean passwordValidator(String password) {
		//System.out.println("Enter your Password :");
		//String password = sc.next();
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Password is Validated");
		else
			System.out.println("Please enter the correct password");
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to user registration page");
	 /*  UserRegistration newUser = new UserRegistration();

		newUser.firstNameValidator();//first name validator
		
		newUser.lastNameValidator();//last name validator
		
		newUser.emailIdValidator();//email id validator
		
		newUser.mobileNoValidator();//mobile no validator
		
		newUser.passwordValidator();//password validator
		*/
	}
}
