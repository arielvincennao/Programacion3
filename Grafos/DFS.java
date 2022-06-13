package Grafos;

import java.util.HashMap;
import java.util.Iterator;

public class DFS {
	
	private GrafoDirigido grafito = new GrafoDirigido();
	private HashMap<Integer, String> colores;

	public DFS(GrafoDirigido grafito) {
		this.grafito = grafito;
	}
	
	public void hacerDFS(){
		
		Iterator<Integer> it = this.grafito.obtenerVertices();
		
		while (it.hasNext()) {  //Recorro todos los vertices del grafo
			Integer vertice = it.next(); //++
			colores.put(vertice, "Blanco");  //Los pinto en blanco en el HashMap
		}
		
		while (it.hasNext()){
			Integer verticeActual = it.next();  //++
			if(colores.get(verticeActual) == "Blanco"){	 //Recorro vertices que estan blancos
				DFS_visit(verticeActual);				 //Los visito
			}
		}
		
	}

	private void DFS_visit(Integer verticeActual) {
		
		// TODO Auto-generated method stub
		colores.put(verticeActual, "Amarillo");  // Lo visito
		Iterator<Integer> itVertices = grafito.obtenerAdyacentes(verticeActual); //Creo un iterador de adyacentes de mi vertice
		
		while(itVertices.hasNext()){  //Por cada adyacente de ese vertice
			Integer verticeI = (Integer) itVertices.next(); //++
			if(colores.get(verticeI) == "Blanco"){   //Si es blanco, lo visito
				DFS_visit(verticeI);	
			}else if(colores.get(verticeI) == "Amarillo"){  //Si ya estaba visitado, hay ciclo
				System.out.println("Hay ciclo");  //HAY CICLO!!!
			}
		}
		
		colores.put(verticeActual, "Negro");  //Finalizado (NO HAY MÁS ADYACENTES) (SALE DE LA FUNCION Y BUSCA VERTICES BLANCOS EN TODO EL GRAFO)
		
	}
}
