package ejercicio3;

public abstract class Figura {
	
	protected int longLado;
	
	protected abstract float medirArea();

	public int getLongLado() {
		return longLado;
	}

	public void setLongLado(int longLado) {
		this.longLado = longLado;
	}
	
	
	

}
