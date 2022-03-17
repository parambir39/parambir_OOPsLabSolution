package com.greatlearning.model;
import java.util.Scanner;

public class DriverClass {
	
	EmployeeServices employee=new EmployeeServices("Parambir", "Singh");
	CredentialServices cs=new CredentialServices();
	String generatedEmail;
	char [] generatedpassword;
	
	System.out.println("Please Enter the departmental preference:");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. HR");
	System.out.println ("4. Legal");
	
	Scanner sc= new Scanner (System.in);
	int option=sc.nextInt();
	switch(int option)
	Case==1;{
		cs.generateEmailaddress("Parambir","Singh", "Technical",)
	}
		
	
	public static void main(String[] args) {
		
	}

}
