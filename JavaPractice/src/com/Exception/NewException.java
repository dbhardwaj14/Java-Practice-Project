// Add all type of exception. 
package com.Exception;

public class NewException {
	public void m1()
	{
		System.out.println("Thanks You");
	}
	public static void main (String[]args)
	{
		//Arthematic Exception
		/*int a = 5;
		int b = 0;
		double c = a/b;*/
		
		//Null Pointer Exception
				/*NewException x = null;
				x.m1();*/
		
	//Array Out of Bound Exception 
			int z [] = {6, 7, 8};
			System.out.println(z[3]);
}
}
