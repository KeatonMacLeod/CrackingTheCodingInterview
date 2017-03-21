package ArraysAndStrings;
import java.util.Arrays;

public class S12 {
	
	public static void main(String[] args)
	{
		final int STRING_LENGTH = 9999;
		String one = "";
		String two = "";
		int startChar = 60;
		char current = '0';
		for (int i = 0; i < STRING_LENGTH; i++)
		{
			if (startChar % 125 == 0)
				startChar = 60;
			current = (char)(startChar%125);
			startChar++;
			one += current;
			two += current;
		}
		System.out.println("Done Initializing");

		boolean resultOne = solutionOne(one, two);
		boolean resultTwo = solutionTwo(one, two);
		System.out.println(resultOne);
		System.out.println(resultTwo);
	}
	
	static boolean solutionOne(String one, String two)
	{
		
		int [] flags = new int [128];
		
		if (one.length() != two.length())
			return false;
		
		for (int i = 0; i < one.length(); i++)
		{
			int indexOne = one.charAt(i);
			int indexTwo = two.charAt(i);
			flags[indexOne] += 1;
			flags[indexTwo] += 1;
		}
		
		for (int j = 0; j < flags.length; j++)
		{
			if (flags[j] % 2 != 0)
				return false;
		}
		
		return true;
	}
	
	static boolean solutionTwo(String one, String two)
	{
		
		if (one.length() != two.length())
			return false;
		
		one = sort(one);
		two = sort(two);
		
		for (int i = 0; i < one.length(); i++)
		{
			if (one.charAt(i) != two.charAt(i))
				return false;
		}
		
		return true;
		}
	
	static String sort(String s)
	{
		char sortedArray[] = s.toCharArray();
		Arrays.sort(sortedArray);
		s = new String(sortedArray);
		return s;
	}

}
