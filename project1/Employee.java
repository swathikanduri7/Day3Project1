package project1;

import java.util.Scanner;

public class Employee 
{

		private String name;
		private int age;
		public static String company="wipro";
		
		public void readData()
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("enter your name");
			name=obj.next();
			System.out.println("enter your age");
			age=obj.nextInt();
		    obj.close();
		}
			public void printData()
			{
				System.out.println("name:" +name);
				System.out.println("age:" +age);
				System.out.println("company:" +company);
				
			}
			
			
	}

