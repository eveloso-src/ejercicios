package ejercicio5collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Copiar un texto del periodico en un String
// Recorrer la nota y en un mapa guardar cada palabra y la cantidad de veces 
// que se repite
// Mostrar la palabra que mas se repite

public class App5EjercicioMap {

	public static void main(String[] args) {
		String texto = "La Embajada de China en Espa�a asegura que los kits de test r�pidos que compr� Espa�a para diagnosticar con m�s rapidez los casos de Covid-19 fueron comprados a una empresa sin licencia. Estos test no funcionan bien, tal como ha adelantado EL PA�S, al presentar una sensibilidad del 30% cuando esta deber�a ser superior al 80%. Podr�an dar falsos negativos, lo que provocar�a que no se detectara a personas contagiadas. Los expertos piden seguir realizando las pruebas PCR, m�s lentas pero m�s seguras.\r\n"
				+ "\r\n" + "\r\n"
				+ "El Ministerio de Comercio de China ofreci� al Ministerio de Sanidad �una lista de recomendaciones de proveedores clasificados� entre los que no se encontraba la compa��a Bioeasy, asegura la Embajada de China en su cuenta oficial de Twitter. Esta es la empresa a la que Espa�a compr� las 340.000 pruebas r�pidas que detectan el ant�geno en 10 o 15 minutos. La embajada afirma asimismo que la empresa todav�a no tiene �licencia oficial de la Administraci�n Nacional de Productos M�dicos de China para vender sus productos�.\r\n"
				+ "\r\n" + "";
		String[] arrayPalabras = texto.split(" ");
//		System.out.println(arrayPalabaras.length);
//		System.out.println(arrayPalabaras[0]);

		Map<String, Integer> mapa = new HashMap<String, Integer>();
		for (int i = 0; i < arrayPalabras.length; i++) {
			String palabra = arrayPalabras[i].toLowerCase();
			if (mapa.get(palabra) != null) {
				// existe entonces sumo uno al total (value)
				int cant = mapa.get(palabra);
				cant++;
				mapa.put(palabra, cant);
			} else {
				// agrego la palabra al mapa con total = 1
				mapa.put(palabra, 1);
			}
		}

		Set<String> claves = mapa.keySet();
		Iterator<String> it = claves.iterator();
		int max = 0;
		String maxPal = "";
		List<ContadorPalabra> listaFinal = new ArrayList<ContadorPalabra>();
		while (it.hasNext()) {
			String palabra = it.next();
			int valor = mapa.get(palabra);
			if (valor > max) {
				max = valor;
				maxPal = palabra;
			}
			ContadorPalabra cp = new ContadorPalabra();
			cp.setContador(valor);
			cp.setPalabra(palabra);
			listaFinal.add(cp);
		}
		System.out.println("la palabra con mas repeticion es " + maxPal + " con " + max);
		Collections.sort(listaFinal);
		// Imprimir la lista (ordenada)
		for (int j = 0; j < listaFinal.size(); j++) {
			ContadorPalabra contPal = listaFinal.get(j);
			System.out.println(contPal.getPalabra() + ": " + contPal.getContador());
		}
	}
}
