package com.assigment;

public class Pattern {
	public static void main (String [] args)
	{
		int l = 1;
		for(int i=1;i<=4;i++)
			{
			for(int k=l;k>=1;k--)
				{
					System.out.print(" ");
				}
			for(int j=i;j<=4;j++)
				{
				System.out.print(j + " ");
				}
		l++;
		System.out.println("");
	}	
}
}
