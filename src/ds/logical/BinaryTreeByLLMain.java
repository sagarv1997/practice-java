package ds.logical;

import ds.nodes.BinaryNode;

public class BinaryTreeByLLMain {
	
	public static void main (String args[]) {
		
		BinaryTreeByLL tree = new BinaryTreeByLL();
		
		tree.traverseLevelOrder();
		tree.insert("20");
		tree.traverseLevelOrder();
		tree.insert("100");
		tree.insert("3");
		tree.insert("50");
		tree.insert("15");
		tree.insert("250");
		tree.insert("35");
		tree.traverseLevelOrder();
		
		// Searching 30 in the tree
		
		boolean searchResult = tree.search("50");
		System.out.println(searchResult);
		
		System.out.println("Pre Order Traversal");
		tree.traversePreOrder(tree.getRoot());
		
		System.out.println("Post Order Traversal");
		tree.traversePostOrder(tree.getRoot());
		
		System.out.println("In Order Traversal");
		tree.traverseInOrder(tree.getRoot());
		
		BinaryNode deepestNode = tree.deepestNode(tree.getRoot());
		System.out.println("Deepest Node of the tree is: " + deepestNode.getValue());
		
		boolean deleteNode = tree.deleteNode("50");
		System.out.println("Node deletion result: " + deleteNode);
		
		deepestNode = tree.deepestNode(tree.getRoot());
		System.out.println("Deepest Node of the tree is: " + deepestNode.getValue());
		
		System.out.println("In Order Traversal");
		tree.traverseInOrder(tree.getRoot());
		
	}

}
