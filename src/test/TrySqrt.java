package test;
import java.util.*;

import java.util.Scanner;


public class TrySqrt {
	public static void main(String[] args) {
		float result;
		float num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		try
		{
			num=sc.nextInt();
			result=num*num;
			System.out.println("Result:" +result);
			
		}
		catch(Exception e)
		{
			System.out.println("Error, cannot calculate the Square root");
			
		}

	}

}



