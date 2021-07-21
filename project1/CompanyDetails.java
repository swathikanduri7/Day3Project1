package project1;

import java.util.Scanner;

public class CompanyDetails {

	public static void main(String[] args) 
	{
		String name;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter you name");
		name=obj.next();
		
		System.out.println("your name is "  +name);
	    obj.close();	

	}

}
