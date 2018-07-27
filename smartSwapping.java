import java.io.*;

public class smartSwapping
{

public static void swapWithoutTemp(int a, int b)
{
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Post swapping Values without using Temp Variable");
		System.out.println("X value "+a);
		System.out.println("Y Value "+b);
}

public static void swapWithTemp(int a, int b)
{
		int temp; 
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Post swapping Values using Temp Variable");
		System.out.println("X value "+a);
		System.out.println("Y Value "+b);
}
	public static void main(String[] args)
	{
		int x = 20;
		int y = 30;
		
		System.out.println("Pre Swapping Values");
		System.out.println("X value "+x);
		System.out.println("Y Value "+y);
		
		swapWithoutTemp(x,y);
		swapWithTemp(x,y);
		
	}
}