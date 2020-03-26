package physical;

public class SingleLinkedListMain {

	public static void main(String[] args) {
	
		SingleLinkedList list = new SingleLinkedList();
		list.createLinkedList("10");
		list.insertIntoLinkedList("20", 1);
		list.insertIntoLinkedList("30", 2);
		list.insertIntoLinkedList("40", 1);
		list.insertIntoLinkedList("50", 1);
		list.insertIntoLinkedList("60", 1);

		list.traverseLinkedList();
		
		int location = list.searchNode("20");
		System.out.println("Location " + location);
		
		System.out.println("Deleting Node at 0 Location");
		list.deleteNode(0);
		list.traverseLinkedList();
		
		System.out.println("Deleting Node at Last Location");
		list.deleteNode(4);
		list.traverseLinkedList();
		System.out.println("Deleting at location 2");
		list.deleteNode(2);
		list.traverseLinkedList();

		location = list.searchNode("60");
		System.out.println("Location " + location);
		
		System.out.println("Deleting node 0");
		list.deleteNode(0);
		list.traverseLinkedList();
		
		System.out.println("Insert at location 0");
		list.insertIntoLinkedList("70", 0);
		list.traverseLinkedList();
	}

}
