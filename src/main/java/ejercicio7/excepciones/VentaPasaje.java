package ejercicio7.excepciones;

public class VentaPasaje {

	public void vender(Pasaje pas, Pasaje[] pasajes, int pos) throws SinPasajeException {
		if (pos > 2) {
			throw new SinPasajeException();
		}
		else {
			pasajes[pos] = pas;
		}
	}
}
