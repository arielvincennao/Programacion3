
public class Main {

	public static void main(String[] args) {
		
	//EJ1
	
	MySimpleLinkedList<Object> lista = new MySimpleLinkedList<Object>();	
	lista.addFront(3);
	lista.addFront(5);
	lista.addFront(2);
	System.out.println("EJ1");
	lista.print();
	
	 //EJ3
	
	Pila pila = new Pila(lista);
	Node n1 = new Node(1);
	pila.push(n1);
	System.out.println("EJ3");
	lista.print();
	System.out.println("Reverse working");
	pila.reverse();
	
	
	//EJ DOUBLE LINKED LIST
	
	ListaDoblementeVinculada l = new ListaDoblementeVinculada();
	l.addFront(1);
	l.addFront(3);
	l.addFront(6);
	
	System.out.println("Lista doblemente vinculada:");
	l.imprimir();

	System.out.println(l.getNode(0));
	System.out.println(l.getNode(1));
	System.out.println(l.getNode(2));

	
	}

	//ALL IS WORKING!
}
