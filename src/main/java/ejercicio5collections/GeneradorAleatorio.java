package ejercicio5collections;

import java.util.Random;

public class GeneradorAleatorio {


	public static int aleatorio() {
		Random ran = new Random();
		return ran.nextInt(10);
	}
}
