package com.ljl.org.test5;

public class Test1
{

	public static void main(String[] args)
	{
		Integer x=1,y=1,z=0,sum=0;
		
		for (int i = 1; i <= 32; i++)
		{
			z=x+y;
			x=y;
			y=z;
			
			if(i==32||i==30)
			{
				sum+=z;
			}
			
			
		}	System.out.println(sum);
	}

}
