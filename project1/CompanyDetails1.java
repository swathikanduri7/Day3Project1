package project1;

import java.util.Scanner;

public class CompanyDetails1 {

	public static void main(String[] args) {
		String name;
		int weight;
		float height;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter your name");
		name=obj.nextLine();
		
		System.out.println("enter your weight");
		weight=obj.nextInt();
		
		System.out.println("enter you height");
		height=obj.nextFloat();
		
		System.out.println("your name is " +name);
		System.out.println("your weight is " +weight);
		System.out.println("your height is" +height);
				
		obj.close();

	}

}
