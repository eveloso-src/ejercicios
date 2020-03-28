package ejercicio5collections;

import java.util.Scanner;

// Programar un juego que consta de adivinar un numero entre 0 y 9 para eso
// vamos a usar la clase Random
// Al adivinar mostrar la cantidad de intentos utilizada
// y si es mayor a 5 intentos mostrar el numero y comenzar otra partida

public class App6Aleatorio {
	
	public static void main(String[] args) {

		// sortear numero alatorio
		int sorteado = GeneradorAleatorio.aleatorio();
		System.out.println("sorteado: " + sorteado);
		
		// pedir numero
		Scanner sc = new Scanner(System.in);
		int intentos = 0;
		
		System.out.println("Ingrese un numero para adivinar el sorteado: ");
		int num = sc.nextInt();
		
		while (intentos < 5 && sorteado != num) {
			System.out.println("Siga participando");
			intentos++;
			System.out.println();
			System.out.println("Ingrese un numero para adivinar el sorteado: ");
			num = sc.nextInt();
		}
		if (sorteado == num) { 
			System.out.println("Felicitaciones acertaste en " + intentos + " intentos!!");
		}
		else {
			System.out.println("No adivinaste! El numero sorteado es " + sorteado);
		}
		
		
	}
	
}
