package ds.nodes;

public class SingleNode {
	
	private SingleNode next; // next type is set as SingleNode so we can store the reference to next object
	private String value;
	
	public SingleNode getNext() {
		return next;
	}
	public void setNext(SingleNode next) {
		this.next = next;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
