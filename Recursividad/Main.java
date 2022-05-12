package Recursividad;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recursividad ejercicios");
		
		
		//Implementar un método recursivo que imprima en forma descendente desde x hasta 1 de uno
		//en uno
		System.out.println("Des desde 5 a 1");
		imprimirDes(5);
		
		//Implementar un método recursivo que imprima en forma ascendente de 1 hasta x de uno en
		//uno.
		System.out.println("As desde 1 a 6");
		imprimirAs(6);
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
		
		
		//BUSQUEDA BINARIA RECURSIVA EN ARREGLO ORDENADOS
		
		/*public int BinariaRecursiva(int [] A, int X, int inicio, int fin){
		int medio;
		if (inicio > fin) return -1; //sucederá si no se encuentra el elemento
		else {
		medio = (inicio + fin) / 2; //al ser medio un int, se realiza un truncado (pierde la parte decimal)
		if (X > A[medio])
		return BinariaRecursiva(A, X, medio+1, fin);
		else
		if (X < A[medio])
		return BinariaRecursiva(A, X, inicio, medio -1);
		else
		return medio;
			}
		}*/
		
	}
}
