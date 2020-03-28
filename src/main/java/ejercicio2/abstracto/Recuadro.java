package ejercicio2.abstracto;

public abstract class Recuadro {

	protected int dimension;

	public Recuadro(int dimension) {
		this.dimension = dimension;
	}

	protected abstract float facturar();
	
	public int getDimension() { 
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	
}
