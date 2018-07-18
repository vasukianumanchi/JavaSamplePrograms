import java.io.*;
import java.util.*;

public class averageSum
{
	public static void main(String[] args)
	{
		int sum=0;
		int ip;
		int count=0;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("input");
			ip = input.nextInt();
			sum= sum+ip;
			count++;
		}while(ip!=0);
		System.out.println("Sum is "+sum);
		System.out.println("Avg is "+(sum/(count-1)));
	}
}