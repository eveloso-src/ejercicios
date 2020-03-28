package ejercicio2.abstracto;

public class Publicidad extends Recuadro{

	private static final int VALOR_PUBLICIDAD = 10;
	private String marca;

	public Publicidad(int dimension, String marca) {
		super(dimension);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	protected float facturar() {
		
		return dimension * VALOR_PUBLICIDAD;
	}
}
