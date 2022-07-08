import java.util.Scanner;

public class Actividad4App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pasa un numero");
		int n1 = sc.nextInt();
		sc.close();
		
		factorial(n1);
	}
	
	public static void factorial (int num1) {
		
		int producto = num1;
		for (int i = 1; i < num1; i++) {
			producto *= i;
		}
		
		System.out.println("Su factorial es " + producto);
	}
}
