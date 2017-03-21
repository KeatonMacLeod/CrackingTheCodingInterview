//KeatonMacLeod
package StacksAndQueues;
import java.util.Random;

import DataStructures.SetOfStacks;
import DataStructures.TwoStackQueue;

public class SAQ33 {

	public static void main (String[] args)
	{
		
		Random random = new Random();
		SetOfStacks setOfStacks = new SetOfStacks();
		int max = 10;
		int min = 1;
		
		for (int i = 0; i < 10; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			System.out.println("Entering: " + value);
			setOfStacks.push(value);
		}//for
		
		while (setOfStacks.numItems != 0)
		{
			System.out.println(setOfStacks.pop());
		}
	}
}
