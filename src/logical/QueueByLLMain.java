package logical;

public class QueueByLLMain {

	public static void main(String[] args) {
		
		
		QueueByLL queue = new QueueByLL();
		
		queue.enQueue("10");
		queue.enQueue("20");
		
		System.out.println("Enqueuing 10 & 20");
		queue.peek();
	
		System.out.println("After Dequeue");
		queue.deQueue();
		System.out.println("Peek");
		queue.peek();
		
		queue.deleteQueue();
		queue.peek();

	}

}
