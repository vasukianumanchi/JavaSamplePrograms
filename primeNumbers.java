// java program to print Prime Numbers
import java.util.*;
import java.io.*;

public class primeNumbers
{
	public static void main(String[] args)
	{
		int maxNumber;
		System.out.println("How many prime numbers do you want to print");
		Scanner sc = new Scanner(System.in);
		maxNumber = sc.nextInt();
		System.out.println("Prime Numbers below "+maxNumber+" are ...");
		for(int i=2;i<=maxNumber;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+"\t");
			}
			
		}
	}
}