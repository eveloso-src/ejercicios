package ejercicios.entidad;

public class Cliente extends Persona{

	private String cuit;

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public float getDescuento(float total) {
		return total * 0.95f;
	}
	
	
}
