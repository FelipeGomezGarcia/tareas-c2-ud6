import java.util.Scanner;

public class Actividad9App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 0, max = 9;
		
		System.out.println("Deifine el tamaño de la array");
		int limite = sc.nextInt();
		sc.close();
		
		int lista[] = rellenar(limite, min, max);
		imprimir(lista);
		
	}
	
	public static int[] rellenar (int limite, int min, int max) {
		int nums[]= new int[limite];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random()*(max-min+1)+min);
		}
		return nums;
	}
	
	public static void imprimir (int lista[]) {
		int suma = 0;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			suma += lista[i];
		}
		System.out.println("Total = " + suma);
	}
}
