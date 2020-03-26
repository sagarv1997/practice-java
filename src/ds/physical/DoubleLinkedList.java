package ds.physical;

import ds.nodes.DoubleNode;

public class DoubleLinkedList {
	
	private DoubleNode head;
	private DoubleNode tail;
	private int size;
	
	public DoubleNode getHead() {
		return head;
	}
	public void setHead(DoubleNode head) {
		this.head = head;
	}
	public DoubleNode getTail() {
		return tail;
	}
	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean existsLinkedList() {
		return head != null;
	}
	
	public DoubleNode createLinkedList(String nodeValue) {
		
		if (existsLinkedList()) {
			throw new Error ("Linked list already exists");
		}
		
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		node.setNext(null);
		node.setPrev(null);
		
		head = node;
		tail = node;
		size = 1;
		
		return head;
	}
	
	public void insertIntoLinkedList (String nodeValue, int location) {
		
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		
		if (!existsLinkedList()) {
			System.out.println("Linked list does not exists!");
			return;
		}
		// At Start location
		else if (location == 0) {
			head.setPrev(node);
			node.setNext(head);
			head = node;
		}
		// At Last location
		else if (location == size) {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
		// In between
		else {
			DoubleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			DoubleNode nextNode = tempNode.getNext();
			node.setPrev(tempNode);
			node.setNext(nextNode);
			nextNode.setPrev(node);
			tempNode.setNext(node);
		}
		setSize(getSize() + 1);
	}
	
	public void traverseLinkedList() {
		if (!existsLinkedList()) {
			System.out.println("Linked list does not exists!");
			
		} else {
			DoubleNode tempNode = head;
			int index = 0;
			while (index < size) {
				System.out.println("-> " + tempNode.getValue());
				tempNode = tempNode.getNext();
				index++;
			}
		}
	}
	
	public void traverseLinkedListReverse() {
		if (!existsLinkedList()) {
			System.out.println("Linked list does not exists!");
			
		} else {
			DoubleNode tempNode = tail;
			int index = size;
			while (index != 0) {
				System.out.println("-> " + tempNode.getValue());
				tempNode = tempNode.getPrev();
				index--;
			}
		}
	}
	
	public int searchNode(String nodeValue) {

		if (!existsLinkedList()) {
			System.out.println("Linked list does not exist!");
			return -1;
		}
		int index = 0;
		DoubleNode tempNode = head;
		while (tempNode.getValue() != nodeValue) {
			tempNode = tempNode.getNext();
			index++;
		}

		return index;
	}
	
	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");// Linked List does not exists
			return;
		} else if (location == 0) { // we want to delete first element
			if (getSize() == 1) { // if this is the only node in this list
				head = tail = null;
				setSize(getSize() - 1);
				return;
			}else {
				head = head.getNext();
				head.setPrev(null);
				setSize(getSize() - 1);
			}
		} else if (location >= getSize()) { // If location is not in range or equal, then delete last node
			DoubleNode tempNode = tail.getPrev(); // temp node points to 2nd last node
			if (tempNode == head) { // if this is the only element in the list
				tail = head = null;
				setSize(getSize() - 1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize() - 1);

		} else { // if any inside node is to be deleted
			DoubleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); // we need to traverse till we find the location
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			tempNode.getNext().setPrev(tempNode);
			setSize(getSize() - 1);
		} // end of else

	}// end of method
}
