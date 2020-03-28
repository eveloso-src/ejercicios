package ejercicio2.abstracto;

public class Nota extends Recuadro{

	public static final int VALOR_NOTA = 2;
	private String texto;
	private String titulo;

	
	
	public Nota(int dimension, String texto, String titulo) {
		super(dimension);
		this.texto = texto;
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	protected float facturar() {
		return dimension * VALOR_NOTA * -1;
	}	
	
	
}
