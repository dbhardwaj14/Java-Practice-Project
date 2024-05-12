package com.Array;

public class Ar1 {
	static int [] a = new int [2];
	static double [] b = new double [2]; 
	static char [] c = new char [2];
	static boolean [] d = new boolean [2];
	static String [] e = new String [2];
	public static void main(String[]args)
	{
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
		a[0] = 1;
		a[1] = 2;
		b[0] = 1.1;
		b[1] = 2.2;
		c[0] = 'a';
		c[1] = 'b';
		d[0] = true;
		d[1] = false;
		e[0] = "Deepali";
		e[1] = "Bhardwaj";
		/*System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
		System.out.println(e.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(e[0]);
		System.out.println(e[1]);*/
		
		/*for(int i=0;i<=1;i++)
		{
			System.out.println(a[i]);
			System.out.println(b[i]);
			System.out.println(c[i]);
			System.out.println(d[i]);
			System.out.println(e[i]);
		}*/
		for(int i=1;i>=0;i--)
		{
			System.out.println(a[i]);
			System.out.println(b[i]);
			System.out.println(c[i]);
			System.out.println(d[i]);
			System.out.println(e[i]);
		}
			
	}
}
