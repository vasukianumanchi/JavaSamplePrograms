// java program to print duplicate elements in a given array of numbers
import java.io.*;
import java.util.*;

public class duplicateElement
{
	public static void main(String[] args)
	{
		int myarray[] = {1,2,3,2,1};
		System.out.println("Array length "+myarray.length);
		
		for(int i=0;i<myarray.length-1;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if((myarray[i]==myarray[j]) && (i!=j))
				{
					System.out.println("Duplicate number "+myarray[j]);
				}
			}
		}
	}
}