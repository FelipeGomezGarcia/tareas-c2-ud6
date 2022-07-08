import java.util.Scanner;

public class Actividad7App {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Moneda de cambio");
		String moneda = sc.next();
		
		System.out.println("Cantidad de euros");
		double dinero = sc.nextDouble();
		sc.close();
		
		cambio(dinero, moneda);
		
	}
	
	public static void cambio(double dinero, String moneda) {
		
		final double DOLARES = 1.28611;
		final double YENES = 129.852;
		final double LIBRAS = 0.86;
		
		double total=0;
		switch (moneda.toLowerCase()) {
		case "dolares":
			total =   dinero * DOLARES;
			break;
		case "yenes":
			total = dinero * YENES;
			break;
		case "libras":
			total = dinero * LIBRAS;
			break;
		default:
			System.out.println("No se puede cambiar a esa moneda");
			break;
		}
		
		System.out.println("Tienes un total de " + total + " " + moneda.toLowerCase());
	}
}
