package com.assigment;

public class PalindromicNo {
	public static void main(String[] args) 
	{
		int k = 0; 
		int m = 0;
		int i = 102;
		{
			int n=i;
			while(n>0)
			{
			k = n%10;
			m = (m*10)+k;
			n = n/10;
			}
			if(m==i);
			{
				System.out.println(i);
			}
		}
	}
}
