package queue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueClass queue = new QueueClass(3);
		queue.isEmpty();
		queue.enqueue(25);
		queue.enqueue(63);
		queue.enqueue(78);
		System.out.println(queue.enqueue(89));
		System.out.println(queue.dequeue());
		System.out.println("***********************");
		queue.display();
		
		
		

	}

}
