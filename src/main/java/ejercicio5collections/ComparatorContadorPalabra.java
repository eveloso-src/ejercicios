package ejercicio5collections;

import java.util.Comparator;

/*
 * comentario multiple linea
 * 
 */

/**
 * Esta clase compara dos objetos de tipo ContadorPalabra
 * 
 * @author Emiliano
 *
 */
public class ComparatorContadorPalabra implements Comparator<ContadorPalabra> {

	/**
	 * Metodo para comparar dos ContadorPalabra segun la palabra
	 */
	public int compare(ContadorPalabra o1, ContadorPalabra o2) {
		return o1.getPalabra().compareTo(o2.getPalabra()); //comentario
	}

}
