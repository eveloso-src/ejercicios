package ejercicios.entidad;

public abstract class Persona {

	private int dni;
	private String nombre;
	
	public abstract float getDescuento(float totals);

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
