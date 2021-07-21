package project1;

public class Maths 
{
	private int factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
			fact=fact*i;
			return fact;
	}
         public int ncr(int n, int r)
         {
        	 return factorial(n)/(factorial(n-r)*factorial(r));
         }
         
         public int npr(int n, int r)
         {
        	 return factorial(n)/factorial(n-r);
         }

}


