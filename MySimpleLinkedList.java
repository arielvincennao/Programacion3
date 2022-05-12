
public class MySimpleLinkedList<T> {
	
private Node first;
private int size;
	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void addFront(int info) {  //Complejidad O(n)
		Node nuevo = new Node(info, this.first); //Creo el nodo referenciando al primero
		this.first = nuevo; // El primero pasa a ser el que agregué
        this.size++; //El tamano de la lista incrementa
	}
	
	public int extractFront() {		//O(n)
		// TODO
		if(this.first != null){ //First node exists
			this.first = this.first.getNext(); //Now the next node is the first
			this.size --; //Substract one list size
			return first.getInfo();  //Garbage collector must delete the node that I unlinked
		}
		return 0;
	}
	
	public Node getFirst(){
		return this.first;
	}

	public boolean isEmpty() {
		return this.first == null;
	}
	
	public Node get(int index) {

		Node current = this.first;
		
		if(index < 0 || index >= this.size){
			return null;
		}
		
		for(int i = 0; i<index; i++){
			current = current.getNext();
		}
		
		return current;
		
		
	}
	
	public int size() {
		// TODO
		return this.size;
	}
	
	 public void print() {
		
		 Node current = this.first;
		 
		 if(this.size > 0){
			 for(int i=0; i<this.size; i++){
				System.out.println(current.getInfo());
				current = current.getNext();
			 }
		 }
		 
	    }

	 

}
