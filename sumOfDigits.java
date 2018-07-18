import java.io.*;
import java.util.*;

public class sumOfDigits
{
	public static void main(String[] args)
	{
		int number,reminder,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		while(number>0){
			reminder = number%10;
			sum = sum+reminder;
			number = number/10;
		}
		System.out.println("Sum is "+sum);
	}
}