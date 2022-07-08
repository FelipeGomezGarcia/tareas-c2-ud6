import java.util.Scanner;

public class Actividad2App {
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros quieres");
		int nums = sc.nextInt();
		
		System.out.println("Difine el minimo");
		int min = sc.nextInt();
		
		System.out.println("Define el maximo");
		int max = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < nums; i++) {
			System.out.println(random(min, max));
		}
	}
	
	public static int random (int min, int max) {
		int numero = (int) (Math.random()*(max-min+1)+min);
		return numero;
	}
}
