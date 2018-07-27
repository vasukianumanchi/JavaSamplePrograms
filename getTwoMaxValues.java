// java program to find first two max values from an array

import java.io.*;
import java.util.*;

public class getTwoMaxValues
{
	public static void main(String[] args)
	{
		int list[] = {12,23,45,14,56,72};
		int maxOne = 0;
		int maxTwo = 0;
		
		for(int i=0;i<list.length;i++)
		{
			if(maxOne < list[i])
			{
				maxTwo = maxOne;
				maxOne = list[i];
			}
			else if(maxTwo<list[i])
			{
				maxTwo = list[i];
			}
		}
		System.out.println("Max 1 ...."+maxOne);
		System.out.println("Max 2 ...."+maxTwo);
	}
}