package com.Exception;

public class AExp {
	public static void m1()
	{
		System.out.println("Thanks You");
	}
	public void main (String[]args)
	{
		//Arthematic Exception 
		/*Scanner Num = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a = Num.nextInt();
		System.out.println("Enter the Second no.");
		int b = Num.nextInt();
		double c = a/b;
		System.out.println(c);
		Num.close(); */
		//Null Pointer Exception
		AExp x = null;
		x.m1();
		//Array Out of Bound Exception 
		int z [] = {6, 7, 8};
		System.err.println(z[3]);

	}
}
