package ejercicio3;

import java.util.Scanner;

// Se desea calcular el area de ciertos terrenos de forma triangular o rectangular. Se debe ingresar los datos
// de base y altura por teclado y calcular el area de cada terreno.
// El ingreso de datos se debe hacer hasta que se seleccione opcion 0 para salir.
// Opcion 1. Area triangulo
// Opcion 2. Area rectangulo
// Opcion 0. Salir
// Opciones a presentar en Menu
// Generar clases aplicando los conocimientos de paradigma de objetos
public class App3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Menu: 1. Triangulo 2: Rectangulo 0: Salir");
		int opcion = sc.nextInt();
		while (opcion != 0) {
			// mas codigo
			switch (opcion) {
			case 1:
				Triangulo tri = new Triangulo();
				System.out.println("Base:");
				int base = sc.nextInt();
				System.out.println("Altura:");
				int altura = sc.nextInt();
				tri.setLongAltura(altura);
				tri.setLongLado(base);
				System.out.println("El area del triangulo es: " + tri.medirArea());
				break;
			case 2:
				Rectangulo cuad = new Rectangulo();
				System.out.println("Base:");
				int baseRec = sc.nextInt();
				System.out.println("Altura:");
				int alturaRec = sc.nextInt();
				cuad.setLongAltura(alturaRec);
				cuad.setLongLado(baseRec);
				System.out.println("El area del rectangulo es: " + cuad.medirArea());
				break;

			default:
				break;
			}
			
			System.out.println("Menu: 1. Triangulo 2: Rectangulo 0: Salir");
			opcion = sc.nextInt();
		}
	}

}
