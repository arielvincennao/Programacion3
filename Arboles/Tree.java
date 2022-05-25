package Arboles;

public class Tree {
	
	private Integer valor;
	private Tree right;
	private Tree left;

	
	public Tree(Integer valor) {
		this.valor = valor;
		this.right = null;
		this.left = null;
	}
	
	//Add element
	public void add(Integer nuevoValor){
		if(this.valor == null){
			this.valor = nuevoValor;
		}else{
			if(this.valor < nuevoValor){
				//right
				if(this.right == null){
					this.right = new Tree(nuevoValor);
				}else{
					right.add(nuevoValor);
				}
			}else if(this.valor > nuevoValor){
				//left
				if(this.left == null){
					this.left = new Tree(nuevoValor);
				}else{
					left.add(nuevoValor);
				}
			}
		}
	}
	
	//Root
	public Integer getRoot(){
		return this.valor; 
	}
	
	//Is empty?
	public boolean isEmpty(){
		return this.valor  == null; 
	}
	
	
	//Has elem?
	public boolean hasElem(Integer num){
		//Buscar en arbol
		if(!this.isEmpty()){ //Si no esta vacio
			if(this.valor == num){
				return true; //Match
			}else if(num > this.valor && this.right != null){ //num>valor y existe el hijo der
				right.hasElem(num);  //Recursividad derecha
			}else if(num < this.valor && this.left != null){ //num<valor y existe el hijo izq
				left.hasElem(num); //Recursividad izquierda
			}
		}
		return false; //No se encuentra	
	}
	

	public int getHeight(){
		int der = 0;
		int izq = 0;
		if(!this.isEmpty()){
			if(this.right != null){
				der = getHeight() + 1;
			}else if(this.left != null){
				izq = getHeight() + 1;
			}
		}
		return Math.max(der, izq);
	}
	
	public void imprimirArbol(){
		
		
		
	}
	
}
