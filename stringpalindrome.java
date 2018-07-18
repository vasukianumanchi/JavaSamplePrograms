import java.io.*;
import java.util.*;

public class stringPalindrome
{
	public static void main(String[] args)
	{
		String original = "abcbabbb";
		String reverse = "";
		int len = original.length();
		System.out.println("Original String is "+original);
		for(int i=len-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		System.out.println("Reverse String is "+reverse);
		if(reverse.equals(original))
		{
			System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
		
	}
}