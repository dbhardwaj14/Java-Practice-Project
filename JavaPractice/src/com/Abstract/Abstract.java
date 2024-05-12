package com.Abstract;

public abstract class Abstract {

	static int x = 10;
	int y = 20;
	static 
	{
		System.out.println("I am static Multi-line Inliazer");
	}
	{
		System.out.println("I am non-static Multi-line Inliazer");
	}
	public static void m2()
	{
		System.out.println("I am static method");
	}
	public void m3()
	{
		System.out.println("I am non-static method");
	}
		abstract public void m1() ;
		public static void main (String[]args)
		{
		System.out.println(x);		
		m2();
		}
}
