package ArraysAndStrings;
import java.util.Random;

public class S11 {

	public static void main (String[] args)
	{
		Random random = new Random();
		String word =  "";
		int max = 90;
		int min = 65;
		int length = 13;
		
		for (int i = 0; i < length; i++)
		{
			char letter = (char)(random.nextInt(max - min + 1) + min);
			word += letter;
		}
		
		System.out.println(word);
		boolean result = isUnique(word);
		System.out.println(result);
	}
	
	static boolean isUnique (String s)
	{
		boolean [] flags = new boolean [128];
		
		for (int i = 0; i < flags.length; i++)
		{
			flags[i] = false;
		}
		
		for (int i = 0; i < s.length(); i++){
			int index = s.charAt(i);
			if (flags[index])
				return false;
			else
				flags[index] = true;
		}
		return true;
	}
}
