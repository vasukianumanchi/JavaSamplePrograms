// java program to print fibonacci series
import java.util.*;
import java.io.*;

public class fibonacciSeries
{
	public static void main(String[] args)
	{
		int fibcount ;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print in Fibonacci Series");
		fibcount = sc.nextInt();
		int[] fibseries = new int[fibcount];

		fibseries[0] = 0;
		fibseries[1] = 1;
	
		for(int i = 2;i<fibcount;i++)
		{
			fibseries[i] = fibseries[i-1] + fibseries[i-2];
		}

		System.out.println("Fibonacci series .... ");
		for(int k=0;k<fibcount;k++)
		{
			System.out.println(fibseries[k]);
		}
		System.out.println("specific element in Fibonacci Series.....");
		System.out.println("Which element you wnat to display from Fibonacci Series ??");
		int fibele = sc.nextInt();
		System.out.print(fibele +"element in fibonacci series is ... ");
		for(int j=0;j<fibcount;j++)
		{
			if(j==fibele)
			{
			System.out.print(fibseries[j-1]);
			}
		}
	}
}