import java.util.Scanner;

public class Actividad6App {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Pasa un numero positivo");
		int n1 = sc.nextInt();
		sc.close();
		
		if (n1 <= 0) {
			System.out.println("El numero no es positivo");
		}else {
			cifras(n1);
		}
	}
	
	public static void cifras (int num1) {
		int conta = 1;
		while (num1>=10) {
			num1 /= 10;
			conta++;
		}
		
		System.out.println("El numero tiene " + conta + " cifras");
		
	}
}
