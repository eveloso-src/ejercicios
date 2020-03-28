package ejercicio3;

public class Triangulo extends Figura{

	protected int longAltura;

	public int getLongAltura() {
		return longAltura;
	}

	public void setLongAltura(int longAltura) {
		this.longAltura = longAltura;
	}

	@Override
	protected float medirArea() {
		return getLongAltura() * getLongLado() / 2;
	}
	
}
