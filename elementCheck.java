import java.io.*;
import java.util.*;

public class elementCheck{
public static void main(String[] args)
{
	ArrayList alist = new ArrayList();
	alist.add("ONE");
	alist.add("SECOND");
	alist.add("THIRD");
	ArrayList list = new ArrayList();
	list.add("ONE");
	list.add("SECOND");
	list.add("RANDON");
	System.out.println("alist contains all elements "+alist.containsAll(list));

}
}