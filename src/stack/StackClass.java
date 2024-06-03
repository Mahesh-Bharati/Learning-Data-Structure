package stack;

public class StackClass {
	
	int size;
	int []arr;
	int n=-1;

	public StackClass() {
		this.size=5;
		arr = new int[size];
	}
	public StackClass(int num)
	{
		this.size=num;
		arr = new int[size];
	}
	public boolean isEmpty()
	{
		if(n==-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull()
	{
		if(n==size-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public String push(int num)
	{
		if(!isFull())
		{
			n=n+1;
			arr[n]=num;	
			return "Element push successfull"+num;
		}
		else {
			return "Stack is full";
		}
	}
	public int pop()
	{
		if(!isEmpty())
		{
			int n = arr[this.n];
			this.n--;
			return n;
		}
		else {
				return -1;
		}
	}
	public int peek()
	{
		int n = arr[this.n];
		return n;
	}
	

}
