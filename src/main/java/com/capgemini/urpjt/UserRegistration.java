package com.capgemini.urpjt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	Scanner sc = new Scanner(System.in);
	
	public void firstNameValidator() {
		System.out.println("Enter your First Nmae");
		System.out.println("First Name should start with uppercase and have min 3 characters");
		String firstName = sc.nextLine();
		Pattern pattern = Pattern.compile("^([A-Z])[A-Za-z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		boolean b = matcher.find();
		if (b)
			System.out.println("First Name is validated");
		else
			System.out.println("Please enter correct First Name");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to user registration page");
		UserRegistration newUser = new UserRegistration();

		newUser.firstNameValidator();
	}
}
