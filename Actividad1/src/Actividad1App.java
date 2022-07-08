import java.util.Scanner;

public class Actividad1App {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que figura quieres calcular el area?");
		System.out.println("(CIRCULO, TRIANGULO, CUADRADO)");
		String figura = sc.next();
		
		double area;
		switch (figura.toUpperCase()) {
		case "CIRCULO":
			area = circulo(sc);
			System.out.println("El area es " + area + " m2");
			break;
		case "TRIANGULO":
			area = triangulo(sc);
			System.out.println("El area es " + area + " m2");
			break;
		case "CUADRADO":
			area = cuadrado(sc);
			System.out.println("El area es " + area + " m2");
			break;
		default:
			System.out.println("Esa figura no esta en la lista");
			break;
		}
	}
	
	public static double circulo (Scanner sc) {
		final double PI = Math.PI;
		
		System.out.println("Indica el radio");
		double radio = sc.nextDouble();
		sc.close();
		
		double area = Math.pow(radio, 2) * PI;
		
		return area;
		
	}
	
	public static double triangulo (Scanner sc) {
		
		System.out.println("Indica la base");
		double base = sc.nextDouble();
		System.out.println("Indica la altura");
		double altura = sc.nextDouble();
		sc.close();
		
		double area = (base * altura) /2;
		
		return area;
		
	}
	
	public static double cuadrado (Scanner sc) {
		
		System.out.println("Indica el lado");
		double lado = sc.nextDouble();
		sc.close();
		
		double area = lado * lado;
		
		return area;
	}
}
