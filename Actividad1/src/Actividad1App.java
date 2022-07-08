import java.util.Scanner;

public class Actividad1App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que figura quieres calcular el area?");
		System.out.println("(CIRCULO, TRIANGULO, CUADRADO)");
		String figura = sc.next();
		
		switch (figura.toUpperCase()) {
		case "CIRCULO":
			circulo(sc);
			break;
		case "TRIANGULO":
			triangulo(sc);
			break;
		case "CUADRADO":
			cuadrado(sc);
			break;
		default:
			System.out.println("Esa figura no esta en la lista");
			break;
		}
	}
	
	public static void circulo (Scanner sc) {
		final double PI = Math.PI;
		
		System.out.println("Indica el radio");
		double radio = sc.nextDouble();
		sc.close();
		
		double area = Math.pow(radio, 2) * PI;
		
		System.out.println("El area del circulo es " + area + " m2");
		
	}
	
	public static void triangulo (Scanner sc) {
		
		System.out.println("Indica la base");
		double base = sc.nextDouble();
		System.out.println("Indica la altura");
		double altura = sc.nextDouble();
		sc.close();
		
		double area = (base * altura) /2;
		
		System.out.println("El area del triangulo es " + area + " m2");
		
	}
	
	public static void cuadrado (Scanner sc) {
		
		System.out.println("Indica el lado");
		double lado = sc.nextDouble();
		sc.close();
		
		double area = lado * lado;
		
		System.out.println("El area del cuadrado es " + area + " m2");
	}
}
