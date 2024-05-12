package com.Exception;

import java.util.Scanner;

public class DivMethod {
	public static void m1()
	{
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a = Num.nextInt();
		System.out.println("Enter the Second no.");
		int b = Num.nextInt();
		double c = a/b;
		Num.close(); 
	}
	public static void main(String[]args)
	{
		m1();
	}
}
