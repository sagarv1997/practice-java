package logical;

import physical.SingleLinkedList;

public class QueueByLL {

	SingleLinkedList list;

	public QueueByLL() {
		list = new SingleLinkedList();
	}

	public boolean isQueueEmpty() {
		if (list.getHead() == null) {
			return true;
		} else
			return false;
	}

	public void enQueue(String value) {
		int location = list.getSize();
		if (location == 0) {
			list.createLinkedList(value);
		} else {
			list.insertIntoLinkedList(value, location + 1);
		}
	}

	public void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Value Dequeued!");
			peek();
			list.deleteNode(0);
		}
	}

	public void peek() {
		if (isQueueEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(list.getHead().getValue());
		}
	}

	public void deleteQueue() {
		list.deleteNode(0);
	}

}
