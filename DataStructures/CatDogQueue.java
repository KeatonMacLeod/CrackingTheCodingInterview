package DataStructures;

public class CatDogQueue {
	public static int animalID;
	public AnimalQueue dogQueue;
	public AnimalQueue catQueue;
	
	public CatDogQueue()
	{
		animalID = 1;
		dogQueue = new AnimalQueue();
		catQueue = new AnimalQueue();
	}
	
	public void enque(int type)
	{
		if (type == 1)
			catQueue.enter(1);
		else if (type == 2)
			dogQueue.enter(2);
		animalID++;
	}
	
	public int dequeueCat()
	{
		return catQueue.leave();
	}
	
	public int dequeueDog()
	{
		return dogQueue.leave();
	}
	
	public int dequeue()
	{
		int oldestCat = catQueue.top().id;
		int oldestDog = dogQueue.top().id;
		
		if (oldestCat > oldestDog)
			return dogQueue.leave();
		else
			return catQueue.leave();
	}
}
