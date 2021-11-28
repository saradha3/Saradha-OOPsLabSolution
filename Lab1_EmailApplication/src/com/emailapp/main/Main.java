package com.emailapp.main;

import java.util.Scanner;

import com.emailapp.model.Employee;
import com.emailapp.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Saradha","Muthukumaran");
		CredentialService cs = new CredentialService();
		System.out.println("Please enter the department from the following");
		System.out.println(" 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			employee.setDepartment("tech");
			break;
			
		case 2:
			employee.setDepartment("admin");
			break;
			
		case 3:
			employee.setDepartment("hr");
			break;
			
		case 4:
			employee.setDepartment("legal");
			break;
			
		default:
			System.out.println("Enter valid department");
		}
		
		cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), employee.getDepartment(), employee);
		cs.generatePassword(employee);
		cs.showCredentials(employee);

	}

}
