//Create an exception and handle it.
package com.ExceptionHandlingDemo;

public class Handling1 {
	public static void main (String[] args)
	{
		try 
		{
		int a = 8;
		int b = 0; 
		double c = a/b;
		System.out.println(c);
		}
		catch (ArithmeticException a)
		{
			System.out.println("Thank You");
		}
		System.out.println("Welcome");
	}
}
