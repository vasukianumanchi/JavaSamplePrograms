// java program to reverse a String

import java.util.*;

public class reverseString{
	public static void main(String[] args)
	{
		String original;
		String reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		original = sc.nextLine();
		int len = original.length();
		StringBuffer sb = new StringBuffer(original);
		for(int i=len-1;i>=0;i--)
		{
			reverse+=original.charAt(i);
		}
		System.out.println("Reverse String is "+reverse);
		
		
		
		System.out.println("reverse String is "+sb.reverse());
		
	}
}