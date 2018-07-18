// java program to print factorial of given number
import java.io.*;
import java.util.*;

public class factorial
{
	public static void main(String[] args)
	{
		int number=4;
		int fact=1;
		
		if(number>1){
		while(number>1)
		{
			fact = fact * number;
			number -- ;
		}
		System.out.println("Factorial  is "+fact);
		}
		else if(number == 0)
		{
			System.out.println("Factorial is 0");
		}
		else if(number == 1)
		{
			System.out.println("Factorial is 1");
		}
	}
}