import java.util.*;
import java.io.*;

public class primeNumber
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find if its Prime or not");
		num = sc.nextInt();
		if(num%2 == 0)
		{
			System.out.println("Entered Number is Prime");
		}
		else
		{
			System.out.println("Entered Number is Not prime");
		}
	}
}