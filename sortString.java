import java.io.*;
import java.util.*;

public class sortString
{
	public static void main(String[] args)
	{
		String[] inputList = {"Jan","Feb","Mar","Apr","May","jun","jul"};
		System.out.println("Given inout list");
		for(int i=0;i<inputList.length;i++)
		{
			System.out.println(inputList[i]);
		}
		
		Arrays.sort(inputList);
		System.out.println("Sorted list");
		for(int j=0;j<inputList.length;j++)
		{
			System.out.println(inputList[j]);
		}
	}
}