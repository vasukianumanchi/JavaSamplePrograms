public class myStringEquals
{
	public static void main(String[] args)
	{
		String a = "JAVA";
		String b  = "java";
		
		if(a.equals(b))
			System.out.println("String a and b are equal");
		else
			System.out.println("String a and b are not equal");
			
		if(a.equalsIgnoreCase(b))
			System.out.println("String a and be are equal");
		else
			System.out.println("String a and b are not equal");
	}
}