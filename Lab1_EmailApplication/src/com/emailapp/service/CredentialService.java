package com.emailapp.service;

import java.util.Random;

import com.emailapp.model.Employee;

public class CredentialService {
	
	
	public void generateEmailAddress(String firstname, String lastname, String department, Employee employee) {
		String email = firstname.toLowerCase() + lastname.toLowerCase() + "@" + department + ".abc.com";
		employee.setEmail(email);
	}
	
	public void generatePassword(Employee employee) {
		String lowercaseletters = "abcdefghijklmnopqrstuvwxyz";
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialChars = "!@#$%&";
		String mixed = lowercaseletters + uppercaseLetters + numbers + specialChars;
		char[] password = new char[8];
		
		Random rand = new Random();
		
		password[0]=numbers.charAt(rand.nextInt(numbers.length()));
		password[1]=uppercaseLetters.charAt(rand.nextInt(uppercaseLetters.length()));
		password[2]=lowercaseletters.charAt(rand.nextInt(lowercaseletters.length()));
		password[3]=specialChars.charAt(rand.nextInt(specialChars.length()));
		
		for (int i=4;i<password.length;i++) {
			password[i]=mixed.charAt(rand.nextInt(mixed.length()));
		}
		employee.setPassword(String.valueOf(password));
		
		
	}
	
	public void showCredentials(Employee employee) {
		String firstname = employee.getFirstName();
		System.out.println("Dear " + firstname + " your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> "+ employee.getPassword());
	}

}
