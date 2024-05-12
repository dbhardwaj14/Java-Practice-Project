package com.Exception;

import java.util.Scanner;

public class Div {
	public void main (String[]args)
	{
		Scanner Num = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a = Num.nextInt();
		System.out.println("Enter the Second no.");
		int b = Num.nextInt();
		double c = a/b;
		System.out.println(c);
		Num.close(); 
	}
}
