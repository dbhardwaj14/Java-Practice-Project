package com.assigment;

public class Armstrong {
	public static void main(String[] args) 
	{
		int k = 0; 
		int l = 0;
		int m = 0;
		int n = 0;
		for(int i=0; i<=500; i++)
		{
			n=i;
			while(i>0)
			{
			k = i%10;
			l = k*k*k;
			m = m+l;
			i = i/10;
			}
			if(m==n)
			{
				System.out.println(n);
			}
		}
	}
}
