package com.assigment;

public class Fibonacci {
	public static void main(String[] args) 
	{
		int k = 0;
		int k1 = 0; 
		int k2 = 1;
		int i = 0;
		while (i<=20)
		{
			k = k1 + k2;
			System.out.println(k);
			k1=k2;
			k2=k;
			i++;	
		}
	}
}
