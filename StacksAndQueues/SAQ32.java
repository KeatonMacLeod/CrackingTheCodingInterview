//KeatonMacLeod
package StacksAndQueues;
import DataStructures.ValMinStack;


public class SAQ32 {
	
	public static void main (String[] args)
	{
		ValMinStack stack = new ValMinStack();
		stack.push(87);
		stack.push(4);
		stack.push(35);
		stack.push(51);
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
	}
}