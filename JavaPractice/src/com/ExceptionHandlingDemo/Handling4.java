//WAP to show use of finally()

package com.ExceptionHandlingDemo;

public class Handling4 {
	int y = 10;
	public static void main(String[] args) {
		try
		{
			Handling4 x = new Handling4();
				x = null;
				System.out.println(x.y);
		}
		finally {
			System.out.println("Thank You");
		}
	}
}
