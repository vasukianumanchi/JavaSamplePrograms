public class maxConsecutiveString
{
	public static void main(String[] args)
	{
		String str  = "aaabbbbcccccc";
		int count =0, cur_count = 1;
		char rep = str.charAt(0);
		int n = str.length();
		
		for(int i=0;i<n;i++)
		{
			if(i<n-1 && str.charAt(i)==str.charAt(i+1))
				cur_count++;
			else
			{
				if(cur_count>count)
				{
					count = cur_count;
					rep=str.charAt(i);
				}
				cur_count = 1;
			}
		}
		System.out.println("Longest length of repeating characters is .."+count);
		System.out.println("Repeating character is "+rep);
	}
}