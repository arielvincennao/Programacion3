package Grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public interface Grafo<T> {
	
	// Agrega un vertice 
		public void agregarVertice(int verticeId);

		// Borra un vertice
		public void borrarVertice(int verticeId);

		// Agrega un arco con una etiqueta, que conecta el verticeId1 con el verticeId2
		public void agregarArco(int verticeId1, int verticeId2, T etiqueta);

		// Borra el arco que conecta el verticeId1 con el verticeId2
		public void borrarArco(int verticeId1, int verticeId2);

		// Verifica si existe un vertice
		public boolean contieneVertice(int verticeId);  

		// Verifica si existe un arco entre dos vertices
		public boolean existeArco(int verticeId1, int verticeId2);
		
		// Obtener el arco que conecta el verticeId1 con el verticeId2
		public Arco<T> obtenerArco(int verticeId1, int verticeId2);

		// Devuelve la cantidad total de vertices en el grafo
		public int cantidadVertices();

		// Devuelve la cantidad total de arcos en el grafo
		public int cantidadArcos();
		
		public ArrayList<Arco<T>> getArcosDeVertice(int clave);

}
