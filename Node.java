
public class Node {
	
	private int info;
	private Node next;

	public Node() {
		this.info = 0;
		this.next = null;
	}
	
	public Node(int info) {
		this.info = info;
		this.next = null;
	}
	
	public Node(int info, Node next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Node [info=" + info + ", next=" + next + "]";
	}

	
	
}
