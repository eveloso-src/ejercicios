package ejercicios.entidad;

public class Empleado extends Persona{

	public static int aporte = 11;
	
	private float sueldo;
	

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public static int getAporte() {
		return aporte;
	}

	public float getDescuento(float total) {
		return total * 0.9f;
	}
	
}
