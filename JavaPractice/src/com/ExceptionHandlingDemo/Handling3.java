//WAP to show use of multiple catch block.
package com.ExceptionHandlingDemo;

public class Handling3 {
	int y = 10;
	public static void main(String[] args) {
		try 
		{
			Handling3 x = new Handling3();
			x = null;
			System.out.println(x.y);
			int z [] = {6, 7, 8};
			System.out.println(z[8]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Welcome");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Thank you");
		}
		}
}