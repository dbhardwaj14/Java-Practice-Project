package com.Abstract;

public class Abstract1 extends Abstract
 {
	@Override
	public void m1() 
	{
		System.out.println("Thank You");
	}
	public static void main (String []args)
	{
		Abstract1 a = new Abstract1();
		a.m1();
		System.out.println(a.x);
		Abstract1 b = new Abstract1();
		System.out.println(b.y);
		b.m2();
		b.m3();
		
	}

}
