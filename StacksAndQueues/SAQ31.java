//KeatonMacLeod
package StacksAndQueues;

public class SAQ31 {

	/*
	 * This kind of questions is one you can talk about and draw on the whiteboard.
	 * Instead of directly implementing it, you can explain concepts,
	 * such as:
	 * 
	 * stackOne: [0, n/3)
	 * stackTwo: [n/3, 2n/3)
	 * stackThree: [2n/3, n)
	 * 
	 * then for push:
	 * 
	 * push (int stackNum, int val)
	 * {
	 * 		if (isFull(stackNum))
	 * 		{
	 * 			throw new FullStackException();
	 * 		}
	 * 		else
	 * 		{
	 * 			stackNum.push(val);
	 * 		}
	 * }
	 * 
	 * pop (int stackNum)
	 * {
	 * 		if (isEmpty(stackNum))
	 * 		{
	 * 			throw new EmptyStackException();
	 * 		}
	 * 
	 * 			int topIndex = indexOfTop(stackNum);
	 * 			int value = values[indexOfTop];
	 * 			sizes[stackNum]--;
	 * 			values[topIndex] = 0;
	 * 			return value;
	 * }
	 * 
	 */
}
