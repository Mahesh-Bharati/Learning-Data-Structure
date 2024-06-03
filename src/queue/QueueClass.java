package queue;

public class QueueClass {
	
	int size;
	int []arr;
	int front;
	int rear;

	public QueueClass() {
		this.size=5;
		arr = new int [size];
		front=rear=-1;
	}
	public QueueClass(int size)
	{
		this.size=size;
		arr = new int [size];
		front=rear=-1;
	}
	public boolean isFull()
	{
		if(front==0 && rear==size-1)
		{
			return true;
		}
		else 
			return false;
	}
	public boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		else
			return false;
	}
	public String enqueue(int num)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=num;
			return "Element added successfully"+arr[rear];
		}
		else {
			return "Queue is full";
		}
	}
	public int dequeue()
	{
		if(!isEmpty())
		{
			int num = arr[front];
			front++;
			if(front>rear)
				front=rear=-1;
			return num;
		}
		else {
			return -1;
		}
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
