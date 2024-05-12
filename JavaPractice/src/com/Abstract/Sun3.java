package com.Abstract;

public class Sun3 extends Sun1
{
	public void m3()
	{
		System.out.println("I am m3");
	}
	public static void main(String[]args)
	{
		Sun3 s1 = new Sun3();
		s1.m1();
		s1.m2();
		s1.m3();
	}
}
