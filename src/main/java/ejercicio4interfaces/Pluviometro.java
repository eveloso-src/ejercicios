package ejercicio4interfaces;

public class Pluviometro implements Instrumento{

	protected int milimetros;
	
	public int getMilimetros() {
		return milimetros;
	}

	public void setMilimetros(int milimetros) {
		this.milimetros = milimetros;
	}

	public void medir() {
		System.out.println("Mide lluvias");
	}

}
