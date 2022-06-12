package Grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class GrafoDirigido<T> implements Grafo<T> {
	
	private HashMap <Integer, ArrayList<Arco<T>>> vertices; //List de nodos con clave | conexiones
	private int cantidadArcos; //Cant conexiones

	public GrafoDirigido() {
		this.vertices = new HashMap<Integer, ArrayList<Arco<T>>>();
		this.cantidadArcos = 0;
	}
	
	@Override
	public void agregarVertice(int verticeId) {
		// TODO Auto-generated method stub
		if(!this.contieneVertice(verticeId)){ //Si grafo no contiene el vertice
			this.vertices.put(verticeId, new ArrayList<Arco<T>>()); //Lo agrego
		}
		
	}

	@Override
	public void borrarVertice(int verticeId) {
		// TODO Auto-generated method stub
		if(this.contieneVertice(verticeId)){ //Si el grafo contiene el vertice
			for(Entry<Integer, ArrayList<Arco<T>>> v : vertices.entrySet()){  //Para cada uno de los vertices
				//Integer key = v.getKey();									//Veo si tienen conexion
			    ArrayList<Arco<T>> value = v.getValue();
			    for(Arco<T> i : value){
			       if(i.getVerticeDestino() == verticeId){
			    	  //Eliminarlo conexion al vertice (nodo)
			    	  //CantArcos --
			       }
			    }                                         	    
			}
			//Elimino el vertice (nodo) y resto cantArcos
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		// TODO Auto-generated method stub
		if(this.contieneVertice(verticeId1) && this.contieneVertice(verticeId2)){ //Contiene vertices(nodos)
			if(true){  //La conexion no existe
				Arco<T> arco = new Arco<T>(verticeId1, verticeId2, etiqueta);
				this.vertices.get(verticeId1).add(arco);  //Add conexion en verticeId1 
				cantidadArcos++;
			}		
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		if(this.existeArco(verticeId1, verticeId2)){ //Existe el arco
			this.vertices.get(verticeId1).remove(this.getArcosDeVertice(verticeId1)); //Borro los arcos del vertice
		}
		
	}

	@Override
	public boolean contieneVertice(int verticeId) {  //Contiene vertice?
		return this.vertices.containsKey(verticeId); // Complejidad: O(1)
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if (this.getArcosDeVertice(verticeId1) != null && this.getArcosDeVertice(verticeId2) != null){
			return true;
		}else{
			return false;
		} 			
	}

	@Override
	public Arco obtenerArco(int verticeId1, int verticeId2) {
		return null;
	}

	@Override
	public int cantidadVertices() {
		return this.vertices.size();
	}

	@Override
	public int cantidadArcos() {
		return this.cantidadArcos;
	}

	@Override
	public ArrayList<Arco<T>> getArcosDeVertice(int clave) {
		ArrayList<Arco<T>> lista = new ArrayList<Arco<T>>();
		//Si lo contiene
		if(this.contieneVertice(clave)){
			for(Entry<Integer, ArrayList<Arco<T>>> v : vertices.entrySet()){
				Integer key = v.getKey();									
			    ArrayList<Arco<T>> value = v.getValue();
			    if(key.equals(clave)){
			    	lista.addAll(value);
			    }
			}
		}else return null;
		return lista;
	}

	

	

}
