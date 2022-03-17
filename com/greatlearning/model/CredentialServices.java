package com.greatlearning.model;
import java.util.Random;

public class CredentialServices {
	
	public char[] generatePassword() {
		
		String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small= "abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialchar="!@#$%^&*()+=?/><~";
		
		
		String values= capital+small+numbers+specialchar;
		Random random=new Random();
		char[] password= new char[8];
		for (int i=0;i<8;i++)
		{
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public String generateEmailaddress(String firstname,String lastname,String department)
	{
		return firstname+lastname+"@"+department+"abc.com";
	}
	public void showCredentials(EmployeeServices employee, String email,char[] generatedPassword) {
		System.out.println("Dear"+employee.getfirstName()+ "your generated credentials are:");
		System.out.println("Email -->"+ email); 
		System.out.println("Password-->"+ generatedPassword);
		}
	
	


}
