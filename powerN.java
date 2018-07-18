// java program to calculate power of N to a number
import java.io.*;
import java.util.*;

public class powerN
{
	public static void main(String[] args)
	{
		int number;
		int power;
		int ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		System.out.println("Enter the power");
		power = sc.nextInt();
		ans = 1;
		
		while(power!=0)
		{
			ans = ans*number;
			power --;
			System.out.println("ans is "+ans);
		}
		System.out.println(" answer is "+ans);
		
	}
}