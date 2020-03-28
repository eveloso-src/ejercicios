package ejercicio4interfaces;

public class Termometro implements Instrumento {

	private float temperatura;
	
	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public void medir() {
		System.out.println("Mide temperatura");
	}

}
