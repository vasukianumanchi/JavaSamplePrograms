import java.io.*;
import java.util.*;

public class maxRepeating
{
	public static void main(String[] args)
	{
		 String str = "aaaabbbbbbbccdd";
		 int n = str.length();
         int count = 0;
         char res = str.charAt(0);
         int cur_count = 1;
 
        // Traverse string except last character
        for (int i = 0; i < n; i++)
        {
            // If current character matches with next
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
                cur_count++;
 
            // If doesn't match, update result
            // (if required) and reset count
            else
            {
                if (cur_count > count)
                {
                    count = cur_count;
                    res = str.charAt(i);
                }
                cur_count = 1;
            }
        }
		System.out.println("Longest Count is "+count);
		System.out.println("character is "+res);
		for(int j=0;j<count;j++)
		{
			System.out.print(res);
		}
	}
}