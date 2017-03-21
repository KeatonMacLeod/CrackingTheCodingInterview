//KeatonMacLeod
package StacksAndQueues;
import java.util.Random;
import DataStructures.Stack;

public class SAQ35 {
	
	public static void main (String[] args)
	{
		
		Random random = new Random();
		Stack stack = new Stack();
		int max = 10;
		int min = 1;
		for (int i = 0; i < 10; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			stack.push(value);
		}
		
		Stack sortedStack = sortStack(stack);
		
		while (!sortedStack.isEmpty())
		{
			System.out.println(sortedStack.pop());
		}

	}
	
	static Stack sortStack (Stack stack)
	{
		Stack tempStack = new Stack();
		int currentVal = Integer.MIN_VALUE;
		int biggestVal = Integer.MIN_VALUE;
		int elementsToPop = stack.getNumItems(); //Elements to pop from temp stack
		int iterations = stack.getNumItems(); //Number of times to run through both loops
		boolean biggestFound = false;
		
		for (int x = 0; x < iterations; x++)
		{
		
			while (!stack.isEmpty())
			{
				currentVal = stack.pop();
				if (currentVal > biggestVal)
				{
					biggestVal = currentVal;
				}
				tempStack.push(currentVal);
			}//while
			
			for (int i = 0; i < elementsToPop; i++)
			{
				currentVal = tempStack.pop();
				if (currentVal != biggestVal || biggestFound)
					stack.push(currentVal);
				else
					biggestFound = true;
			}//for
		
		tempStack.push(biggestVal);
		elementsToPop--;
		biggestVal = Integer.MIN_VALUE;
		biggestFound = false;
		
		}//for
		
		return tempStack;
	}
}
