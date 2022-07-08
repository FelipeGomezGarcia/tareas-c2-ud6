import java.util.Scanner;

public class Actividad10App {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Define el tamaño de la array");
		int limite = sc.nextInt();
		
		System.out.println("Minimo de rango");
		int min = sc.nextInt();
		
		System.out.println("Maximo de rango");
		int max = sc.nextInt();
		sc.close();
		
		int lista[] = rellenar(limite, min, max);
		imprimir(lista);
		
	}
	
	public static int[] rellenar (int limite, int min, int max) {
		
		int nums[] = new int[limite];
		int i = 0;
		
		while ( i < nums.length) {
			int num = (int) (Math.random()*(max-min+1)+min);
			if (primo(num)) {
				nums[i] = num;
				i++;
			} 
		}
		
		return nums;
	}
	
	public static boolean primo (int num) {
		
		boolean esPrimo = true;
		int i = 2;
		
		while (esPrimo && i < num) {
			if (num%i == 0) {
				esPrimo = false;
			}
			i++;
		}
		
		return esPrimo;
	}
	
	public static void imprimir (int lista[]) {
		
		int maximo = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			if (lista[i] > maximo) {
				maximo = lista[i];
			}
		}
		System.out.println("El numero mas alto es " + maximo);
	}
	
}
