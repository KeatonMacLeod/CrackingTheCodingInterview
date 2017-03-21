//KeatonMacLeod
package StacksAndQueues;
import java.util.Random;
import DataStructures.CatDogQueue;

public class SAQ36 {
	
	public static void main (String[] args)
	{
		//1 = cats
		//2 = dogs
		Random random = new Random();
		CatDogQueue queue = new CatDogQueue();
		int max = 2;
		int min = 1;
		for (int i = 0; i < 8; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			queue.enque(value);
			
			//The -1 in the print statements is because the ID increases before the
			//print. This makes it easier to understand in the console output.
			
			if (value == 1)
				System.out.println("Enter cat with ID: " + (CatDogQueue.animalID-1));
			else if (value == 2)
				System.out.println("Enter dog with ID: " + (CatDogQueue.animalID-1));
		}
		
		System.out.println("The oldeset cat has an id of: " + queue.dequeueCat());
		System.out.println("The oldeset dog has an id of: " + queue.dequeueDog());
	}
}
