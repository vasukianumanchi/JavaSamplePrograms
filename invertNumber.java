import java.io.*;

public class invertNumber
{
	public static void main(String[] args)
	{
		int number = 123;
		int temp = number;
		int invert =0;
		while(temp!=0)
		{
			invert = (invert*10)+(temp%10);
			temp = temp/10;
		}
		System.out.println("Invert of given number "+number+" is "+invert);
		if(number==invert)
		{
			System.out.println("Given number is pallindrome");
		}
		else 
		{
			System.out.println("Given number is Not a pallindrome");
		}
	}
}