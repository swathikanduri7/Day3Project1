package project1;

public class Factorial {

	public static void main(String[] args) {
		
		int i, fact1=1,n1=8;
		int fact2=1,n2=5;
		for(i=1;i<=n1;i++)
		fact1=fact1*i;
			
		System.out.println("factorial of a number is:" +fact1);
		
		for(i=1;i<=n2;i++)
			fact2=fact2*i;
				
			System.out.println("factorial of a number is:" +fact2);

	}

}
