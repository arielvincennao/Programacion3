package Recursividad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recursividad ejercicios");
		
		int[] myNum = {4, 8, 10, 15, 30, 33, 50, 100, 300, 400};
		
		System.out.println(buscarElem(myNum, 1, 0, 9));  //Busqueda recursiva
		System.out.println(buscarElem(myNum, 50, 0, 9)); //Busqueda recursiva
		
		System.out.println("----------------------------");
		//Implementar un método recursivo que imprima en forma descendente desde x hasta 1 de uno
		//en uno
		System.out.println("Des desde 5 a 1");
		imprimirDes(5);
		
		//Implementar un método recursivo que imprima en forma ascendente de 1 hasta x de uno en
		//uno.
		System.out.println("As desde 1 a 6");
		imprimirAs(6);
		
		
		System.out.println("Ordenamiento Burbujeo");
		ordenamientoBurbujeo();
		
	}

	private static void imprimirDes(int num) {
		if(num>0){ //"Condicion de corte"
			System.out.println(num);
			imprimirDes(num - 1); //"Recursividad" -> (No necesité un for)
		}
	}
	
	private static void imprimirAs(int num) {
		if(num>0){ //"Condicion de corte"
			imprimirAs(num - 1); //"Recursividad" -> (No necesité un for) //Va hasta el 1, condicion de corte y vuelve
			System.out.println(num);
		}
		
		//---------------------------------------------------------------------
		//IMPORTANTE
		//BUSQUEDA BINARIA RECURSIVA EN ARREGLO ORDENADO
		//Buscar un numero en un arreglo ordenado ,recursivamente
		
		/*public int BinariaRecursiva(int [] A, int X, int inicio, int fin){
		int medio;
		if (inicio > fin) return -1; //sucederá si no se encuentra el elemento
		else {
			medio = (inicio + fin) / 2; //al ser medio un int, se realiza un truncado (pierde la parte decimal)
			if (X > A[medio])
			return BinariaRecursiva(A, X, medio+1, fin);
			else if (X < A[medio])
			return BinariaRecursiva(A, X, inicio, medio -1);
			else
			return medio;
			}
		}*/	
		
	}
	
	
	//------------------------------------------------------------------------
	
	//Algoritmos de ordenamiento 
	
	
	//Burbujeo -> Algoritmo iterativo
	//Burbujeo  o(n2) ES MALO!!! Se puede mejorar por un boolean, pero el peor caso es el mismo
	
	private static void ordenamientoBurbujeo(){
		int[] myNum = {6, 5, 3, 1, 8, 7, 2, 4};
		int aux;
		for(int i=0; i<myNum.length; i++){
			for(int j=0; j<myNum.length - 1; j++){
				if(myNum[j] > myNum[j+1]){
					aux = myNum[j+1];			//Guardo el siguiente en un aux
					myNum[j+1] = myNum[j];		//El siguiente pasa a ser el anterior
					myNum[j] = aux;				//El anterior pasaa a ser el siguiente (aux)
				}
			}
		}

		/*for(int m=0; m<myNum.length; m++){
			System.out.println(myNum[m]);
		}*/
		
	}
	
	//------------------------------------------------
	
	//Ordenamiento Mergesort recursivo O(log2n)
	
	//Ordenamiento quicksort recursivo O(log2n)
	
	//------------------------------------------------
	
	/*Implemente un algoritmo recursivo para buscar un elemento en un arreglo ordenado
ascendentemente¨*/
	
	
	private static int buscarElem(int [] A, int busq, int inicio, int fin){
		
		//	int[] myNum = {4, 8, 10, 15, 30, 33, 50, 100, 300, 400};
		
		int medio;
		
		if(inicio > fin){
			return -1;  //No existe
		}else {
		 medio = (inicio + fin) / 2; 
			if (busq > A[medio]){
				return buscarElem(A, busq, medio+1, fin); // Mi busqueda es mayor al medio  -> miro derecha
			}
			else if (busq < A[medio]){
				return buscarElem(A, busq, inicio, medio-1);  // Mi busqueda es menor al medio  -> miro izquierda
			}
			else{
				return medio;  //Se encontro
			 }
			}
		}
		
	}


	

