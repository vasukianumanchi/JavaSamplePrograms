//Java program to print Star pyramid
import java.util.*;
public class pattern2
{
	public static void main(String[] args)
	{
	int n,k;
	Scanner input = new Scanner(System.in);
	System.out.println("How may rows to print");
	n = input.nextInt();
	k = 2*n -2;
		//outer loop to handle number of rows
		for(int i=0;i<n;i++) //6 rows
		{
			//number of spaces
			
			for(int j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			k = k-1;
			//loop to print *
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}