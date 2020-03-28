package ejercicio2.abstracto;

import java.util.Scanner;

// Tenemos un periodico online
// Se necesita una app que calcule el total recaudado de la pagina
// El sitio muestra Publicidades y Notas. Las publicidades se cobran
// 10 pesos por pixel y las notas se pagan (egreso) 2 pesos por pixel
// Calcular el ingreso de un dia de publicaciones y notas ingresando
// dimension en pixel de nota y de publicidades y son 2 de cada una
// Generar las clases aplicando paradigma de objetos y mostrar el total
public class App {

	private static int TOTAL_PUBLICACIONES = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Recuadro[] portada = new Recuadro[TOTAL_PUBLICACIONES];
		for (int i = 0; i < TOTAL_PUBLICACIONES; i++) {

			System.out.println("Ingrese dimension");
			int dimension = sc.nextInt();
			
			System.out.println("Ingrese 1. Publicidad 2. Nota");
			int opcion = sc.nextInt();
			
			if (opcion == 1) {
				System.out.println("Ingrese marca: ");
				String marca = sc.next();
				Publicidad pub = new Publicidad(dimension, marca);
				portada[i] = pub;
			}
			else {
				System.out.println("Ingrese titulo");
				String titulo = sc.next();
				Nota not = new Nota(dimension, "", titulo);
				portada[i] = not;
			}
		}
		
		float total = 0;
		for (int a = 0; a < TOTAL_PUBLICACIONES; a++) {
			total = total + portada[a].facturar();
		}
		
		System.out.println("El total facturado es : " + total);


	}
}
