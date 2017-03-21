//KeatonMacLeod
package StacksAndQueues;
import DataStructures.SetOfStacks;

public class SAQ33 {

	public static void main (String[] args)
	{
		SetOfStacks setOfStacks = new SetOfStacks();
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		setOfStacks.push(6);
		setOfStacks.push(7);
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		setOfStacks.push(33);
		setOfStacks.push(42);
		setOfStacks.push(51);
		setOfStacks.push(69);
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
	}
}
