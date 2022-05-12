
public class ListaDoblementeVinculada {

	private NodeDouble first;
	private int size;
	
	public ListaDoblementeVinculada() {
		this.first = null;
		this.size = 0;
	}

	public void addFront(int num){
		if(this.first==null){ 
			this.first = new NodeDouble(null,null,num);
			this.size++;
		}else{
			 NodeDouble nuevo = new NodeDouble(null,first,num);
			 this.first = nuevo;
			 this.size++;
		}
	}
	
	public int getNode(int pos){
		NodeDouble current = this.first;
		if(size>0 && size >= pos){
			for(int i = 0; i<pos; i++){
				current = current.getNextNode();
			}
			return current.getInfo();
		}else{
			return 0;
		}
	}
	
	public void imprimir(){
		
		String res = " || ";
		NodeDouble current = this.first; //Puntero actual
		
		if(this.size>0){
		for(int i=0; i<size; i++){
			res += current.getInfo() + " || ";
			current = current.getNextNode(); //El actual pasa a ser el siguiente
		}
		System.out.println(res);
		}
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public NodeDouble getFirst() {
		return first;
	}

	public void setFirst(NodeDouble first) {
		this.first = first;
	}
	
}
