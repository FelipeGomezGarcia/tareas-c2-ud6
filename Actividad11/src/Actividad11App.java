import java.util.Scanner;

public class Actividad11App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Define el tamaño de las listas");
		int tamaño = sc.nextInt();
		sc.close();
		
		int lista1[] = rellenarLista(tamaño);
		int lista2[] = rellenarLista(tamaño);
		int lista3[] = productoListas(lista1, lista2);
		
		imprimirListas(lista1, "Primera lista");
		imprimirListas(lista2, "Segunda lista");
		imprimirListas(lista3, "Tercera lista");
		
	}
	
	public static int[] rellenarLista (int limite) {
		int nums [] = new int[limite];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*20+1);
		}
		
		return nums;
	}
	
	public static int[] productoListas (int lista1[], int lista2[]) {
		int producto[] = new int[lista1.length];
		
		for (int i = 0; i < lista1.length; i++) {
			producto[i] = lista1[i] * lista2[i];
		}
		
		return producto;
	}
	
	public static void imprimirListas (int lista[], String numeroLista) {
		
		System.out.println(numeroLista);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
}
