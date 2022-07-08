import java.util.Scanner;

public class Actividad8App {
	public static void main (String[] args) {
		
		int lista[] = rellenar();
		imprimir(lista);
		
	}
	
	public static int[] rellenar () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros ");
		int nums[] = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		return nums;
	}
	
	public static void imprimir (int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(i + " " + lista[i]);
		}
	}
}
