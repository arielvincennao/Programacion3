
public class NodeDouble {
	
	private NodeDouble previousNode;
	private NodeDouble nextNode;
	private int info;
	
	public NodeDouble(NodeDouble previousNode, NodeDouble nextNode, int info) {
		this.setPreviousNode(previousNode);
		this.setNextNode(nextNode);
		this.setInfo(info);
	}
	
    public NodeDouble(){
    	this.setPreviousNode(null);
    	this.setNextNode(null);
    	this.setInfo(0);
    }

	public NodeDouble getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(NodeDouble previousNode) {
		this.previousNode = previousNode;
	}

	public NodeDouble getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeDouble nextNode) {
		this.nextNode = nextNode;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	
	
}
