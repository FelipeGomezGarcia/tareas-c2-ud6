import java.util.ArrayList;
import java.util.Scanner;

public class Actividad12App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Define el tamaño de la array");
		int tamaño = sc.nextInt();
		
		System.out.println("Apareceran los numeros terminados con el que tu indiques");
		int n1 = sc.nextInt();
		sc.close();
		
		int lista1[] = rellenarLista(tamaño);
		if (n1 < 10 && n1 >= 0) {
			ArrayList<Integer> lista2 = listaFiltrada(lista1, n1);
			imprimir(lista2);
		}else {
			System.out.println("El numero introducido no es un digito");
		}
		
		
	}
	
	public static int[] rellenarLista (int tamaño) {
		
		int nums[] = new int[tamaño];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*300+1);
		}
		
		return nums;
	}
	
	public static ArrayList<Integer> listaFiltrada(int lista[], int num) {
		
		ArrayList<Integer> filtrada = new ArrayList<Integer>();
		int ultimoNum= 0;
		
		for (int i = 0; i < lista.length; i++) {
			ultimoNum = lista[i];
			if (ultimoNum%10 == num) {
				filtrada.add(lista[i]);
			}
		}
		
		return filtrada;
	}
	
	public static void imprimir (ArrayList<Integer> lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));	
		}
		
	}
}
