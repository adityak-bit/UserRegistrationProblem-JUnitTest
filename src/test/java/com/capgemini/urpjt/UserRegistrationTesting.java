package com.capgemini.urpjt;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTesting {
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.firstNameValidator("Aditya");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.firstNameValidator("aditya");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.lastNameValidator("Kumar");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.lastNameValidator("kumar");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenEmail_Proper_ReturnTruee() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.emailIdValidator("abz@bridgelabz.co.in");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenEmail_Improper_ReturnFalse() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.emailIdValidator("abc.com");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.passwordValidator("Aditya@654");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Improper_ReturnFalse() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.passwordValidator("aditya123");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.mobileNoValidator("91 1234567890");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        UserRegistration user = new UserRegistration();
	        boolean result = user.firstNameValidator("12345");
	        Assert.assertFalse(false);
	    }
}