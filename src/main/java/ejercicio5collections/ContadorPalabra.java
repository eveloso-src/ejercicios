package ejercicio5collections;

public class ContadorPalabra implements Comparable<ContadorPalabra>{

	private String palabra;
	private int contador;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int compareTo(ContadorPalabra o) {
		return o.getContador() - this.getContador() ;
	}

}
