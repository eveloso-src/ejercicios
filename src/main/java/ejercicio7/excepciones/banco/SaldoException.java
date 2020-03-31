package ejercicio7.excepciones.banco;

public class SaldoException extends Exception {

	private String mensaje;

	public SaldoException(String mensaje) {
		super(mensaje);
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
