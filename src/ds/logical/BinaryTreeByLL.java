package ds.logical;

import java.util.LinkedList;
import java.util.Queue;

import ds.nodes.BinaryNode;

public class BinaryTreeByLL {

	private BinaryNode root;

	public BinaryNode getRoot() {
		return root;
	}

	public void setRoot(BinaryNode root) {
		this.root = root;
	}

	public BinaryTreeByLL() {
		root = null;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void insert(String value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		if (isEmpty()) {
			root = node;
			System.out.println("First Value inserted in the tree");
			return;
		}
		// Using a queue to traverse and first empty cell by level order traversal.
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.getLeft() == null) {
				presentNode.setLeft(node);
				System.out.println("Node successfully inserted in left");
				break;
			} else if (presentNode.getRight() == null) {
				presentNode.setRight(node);
				System.out.println("Node successfully inserted in right");
				break;
			}
			// Adding the child of the root node
			else {
				queue.add(presentNode.getLeft());
				queue.add(presentNode.getRight());
			}
		}
	}

	public boolean search(String value) {
		boolean result = false;
		if (isEmpty()) {
			System.out.println("Binary Tree is empty!");
			return result;
		}
		// Using level order traversing to find the node
		else {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				if (presentNode.getValue() == value) {
					result = true;
					System.out.println(presentNode.getValue() + " found in the tree!");
					break;
				} else {
					if (presentNode.getLeft() != null) {
						queue.add(presentNode.getLeft());
					}
					if (presentNode.getRight() != null) {
						queue.add(presentNode.getRight());
					}
				}
			}
		}

		return result;
	}

	public void traverseLevelOrder() {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty!");
		}
		// In Level order traversal we use a queue, we first enqueue a root then we use
		// a while loop to enqueue it's left and right child and remove the first
		// element of queue.
		else {
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode presentNode = queue.remove();
				System.out.println("-> " + presentNode.getValue());
				if (presentNode.getLeft() != null) {
					queue.add(presentNode.getLeft());
				}
				if (presentNode.getRight() != null) {
					queue.add(presentNode.getRight());
				}
			}
		}
	}

	public void traversePreOrder(BinaryNode root) {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		// Root
		// Left
		// Right
		else {
			if (root == null) {
				return;
			}
			System.out.println("-> " + root.getValue());
			traversePreOrder(root.getLeft());
			traversePreOrder(root.getRight());

		}
	}

	public void traverseInOrder(BinaryNode root) {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		// Left
		// Root
		// Right
		else {
			if (root == null) {
				return;
			}
			traversePreOrder(root.getLeft());
			System.out.println("-> " + root.getValue());
			traversePreOrder(root.getRight());

		}
	}

	public void traversePostOrder(BinaryNode root) {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		// Left
		// Right
		// Root
		else {
			if (root == null) {
				return;
			}
			traversePreOrder(root.getLeft());
			traversePreOrder(root.getRight());
			System.out.println("-> " + root.getValue());

		}
	}

	public BinaryNode deepestNode(BinaryNode root) {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.getLeft() != null) {
				queue.add(presentNode.getLeft());
			}
			if (presentNode.getRight() != null) {
				queue.add(presentNode.getRight());
			}
		}

		return presentNode;
	}

	public void deleteDeepestNode() {
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode = null;
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			/*
			 * Here if Left node of the present is empty then set the previous nodes right,
			 * as null as the present node will be at the right of the previous node
			 */
			if (presentNode.getLeft() == null) {
				previousNode.setRight(null);
				return;

			}
			/*
			 * Here if Right node of the present node is empty then set the presentNode left
			 * as null as the present node doesn't have right and left is the only deepest
			 * node
			 */
			else if (presentNode.getRight() == null) {
				presentNode.setLeft(null);
				return;
			}
			queue.add(presentNode.getLeft());
			queue.add(presentNode.getRight());
		}
	}

	public boolean deleteNode(String value) {
		boolean result = false;
		if (isEmpty()) {
			System.out.println("Binary Tree is empty");
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			// If node found, set the node value to the deepest node and remove the deepest
			// node
			if (presentNode.getValue() == value) {
				presentNode.setValue(deepestNode(root).getValue());
				deleteDeepestNode();
				System.out.println("Node deleted!");
				result = true;
				return result;
			} else {
				if (presentNode.getLeft() != null)
					queue.add(presentNode.getLeft());
				if (presentNode.getRight() != null)
					queue.add(presentNode.getRight());
			}
		}
		return result;
	}

}
