import java.util.Scanner;

public class Actividad3App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pasa un numero entero");
		int n1 = sc.nextInt();
		sc.close();
		
		if (primo(n1)) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
	}
	
	public static boolean primo (int num1) {
		boolean esPrimo = true;
		int i = 2;
		while (esPrimo && i < num1) {
			if (num1%i == 0) {
				esPrimo = false;
			}
			i++;
		}
		return esPrimo;
	}
}
