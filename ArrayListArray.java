import java.util.*;

public class ArrayListArray
{
	public static void main(String[] args)
	{
		ArrayList arrlist = new ArrayList();
		arrlist.add("ONE");
		arrlist.add("TWO");
		arrlist.add("THREE");
		System.out.println("list before reversing ..");
		System.out.println(arrlist);
		Collections.reverse(arrlist);
		System.out.println("list after reversing ... ");
		System.out.println(arrlist);
		System.out.println("Sublist ..."+arrlist.subList(0,2));
		
	}
}