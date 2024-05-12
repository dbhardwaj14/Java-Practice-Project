//Create and exception and handle it using throws keyword.
package com.ExceptionHandlingDemo;

public class Handling2 {
	public static void m1()throws ArrayIndexOutOfBoundsException
	{
		int x [] = {6, 7, 8};
		System.out.println (x[3]);
		System.out.println("Thank you");
	}

	public static void main(String[]args)
	{
		try
		{
		m1();
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Thank You");
		}
	}
}
