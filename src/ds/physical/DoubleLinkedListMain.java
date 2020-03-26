package ds.physical;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		
		System.out.println("Double Linked List Created!");
		list.createLinkedList("10");
		list.traverseLinkedList();
		
		System.out.println("Inserting at Start Position");
		list.insertIntoLinkedList("20", 0);
		list.traverseLinkedList();
		
		System.out.println("Inserting at Middle Position");
		list.insertIntoLinkedList("30", 1);
		list.traverseLinkedList();
		
		System.out.println("Inserting at Last Position");
		list.insertIntoLinkedList("40", 3);
		list.traverseLinkedList();
		
		System.out.println("Reverse Tranversing");
		list.traverseLinkedListReverse();
		
	}

}
