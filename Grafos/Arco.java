package Grafos;

public class Arco<T> {
	
	private int verticeOrigen;  //Nodo Origen
	private int verticeDestino;  //Nodo Destino
	private T etiqueta;
	
	public Arco(int verticeOrigen, int verticeDestino, T etiqueta) {
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
		this.etiqueta = etiqueta;
	}
	
	// Complejidad: O(1)
	public int getVerticeOrigen() {
		return verticeOrigen;
	}
	
	// Complejidad: O(1)
	public int getVerticeDestino() {
		return verticeDestino;
	}

	// Complejidad: O(1)
	public T getEtiqueta() {
		return etiqueta;
	}
	
	

	// Complejidad: O(1)
	public String toString() {
		return "" + this.getEtiqueta();
	}
	
	
	

}
