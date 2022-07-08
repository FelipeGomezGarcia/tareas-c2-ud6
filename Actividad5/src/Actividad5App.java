import java.util.Scanner;

public class Actividad5App {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Pasa un numero");
		int n1 = sc.nextInt();
		sc.close();
		
		System.out.println(binario(n1));
	}
	
	public static String binario (int num1) {
		
		String binari = "";
		while (num1>=2) {
			binari += num1%2;
			num1 = num1/2;
		}
		binari += num1;
		
		String ordenado = "";
		for (int i = binari.length() -1; i >= 0; i--) {
			ordenado += binari.charAt(i);
		}
		
		return ordenado;
	}
}
