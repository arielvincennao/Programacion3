
public class Pila {
	//Ejercicio2
	private MySimpleLinkedList lista;
	
	public Pila(MySimpleLinkedList lista) {
		this.lista = lista;
	}

	public void push(Node n){
		lista.addFront(n.getInfo());		
	}
	
	public void pop(){
		if(lista.size()>0){
			System.out.print("Ultimo elemento agregado: " + lista.get(1));
			lista.extractFront();	
		}
	}
	
	public void reverse(){
		MySimpleLinkedList auxiliar = new MySimpleLinkedList();
		Node current = lista.getFirst();
		
		for(int i=0; i<lista.size(); i++){
			auxiliar.addFront(current.getInfo());
			current = current.getNext();
		}
		
		auxiliar.print();
	}

}
