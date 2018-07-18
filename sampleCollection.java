// java program on sample collection operations
import java.util.*;
import java.io.*;

public class sampleCollection
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("JAVA");
		al.add("C#");
		al.add("PYTHON");
		al.add("AWS");
		System.out.println("Array elements "+al);
		System.out.println("Array size"+al.size());
		System.out.println("Is arraylist empty"+al.isEmpty());
		System.out.println("Index of AWS is "+al.indexOf("AWS"));
		System.out.println("element at index 2 is "+al.get(2));
		al.add(2,"PERL");
		System.out.println("New Array List after adding element is ... ");
		System.out.println(al);
		System.out.println("Printing array list elements using iterator");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayList copy = (ArrayList)al.clone();
		System.out.println("Copied Array List .. "+copy);
	}
}