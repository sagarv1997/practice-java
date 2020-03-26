package physical;

import nodes.SingleNode;

public class SingleLinkedList {
	// Setting Global variables for head and tail
	private SingleNode head;
	private SingleNode tail;
	private int size; // Used to store the size of the linked list

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleNode createLinkedList(String nodeValue) {

		SingleNode node = new SingleNode();

		node.setValue(nodeValue);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;

		return head;
	}

	public boolean existsLinkedList() {
		return head != null;
	}

	public void insertIntoLinkedList(String nodeValue, int location) {

		SingleNode node = new SingleNode();
		node.setValue(nodeValue);

		if (!existsLinkedList()) {
			System.out.println("Linked list does not exist!");
		}

		// Insert at first position
		else if (location == 0) {
			node.setNext(head); // Setting the current node first which is the head
			head = node;
		}
		// Insert at last position
		else if (location >= size) {
			node.setNext(null);
			tail.setNext(node); // Here tail references to the previous node, so tail.setnext() means setting
								// the previous last node next value to new node.
			tail = node;
		}
		// Insert in between
		else {
			SingleNode tempNode = head;
			int index = 0;

			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}

			SingleNode nextNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(nextNode);
		}

		setSize(getSize() + 1);
	}

	public void traverseLinkedList() {

		if (!existsLinkedList()) {
			System.out.println("Linked list does not exist!");
			return;
		} else {
			int index = 0;
			SingleNode tempNode = head;

			while (index < size) {
				System.out.println("-> " + tempNode.getValue());
				tempNode = tempNode.getNext();
				index++;
			}
		}
	}

	public int searchNode(String nodeValue) {

		if (!existsLinkedList()) {
			System.out.println("Linked list does not exist!");
			return -1;
		}
		int index = 0;
		SingleNode tempNode = head;
		while (tempNode.getValue() != nodeValue) {
			tempNode = tempNode.getNext();
			index++;
		}

		return index;
	}

	public void deleteNode(int location) {

		if (!existsLinkedList()) {
			System.out.println("Linked list does not exist!");
			return;
		}
		// Delete from first position
		else if (location == 0) {
			SingleNode tempNode = head.getNext();
			head = tempNode;
			setSize(getSize() - 1);
			if (getSize() == 0) {
				tail = null;
			}
		} else if (location > size - 1) {
			System.out.println("Index out of bound!");
		}
		// Delete from last position
		else if (location == size - 1) {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);
			if (getSize() == 0) {
				tail = null;
			}
		}
		// Delete in between
		else {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize() - 1);
		}

	}

}
