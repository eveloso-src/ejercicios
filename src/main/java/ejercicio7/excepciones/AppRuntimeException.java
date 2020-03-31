package ejercicio7.excepciones;

public class AppRuntimeException {

	public static void main(String[] args) {

		try {
			int num = 0;
			int resultado = num / num;
			System.out.println("El resultado es " + resultado);
		} catch (ArithmeticException eexecp) {
			System.out.println("Execpcion: " + eexecp.getMessage()); //
			System.out.println("debe ingresar un numero diferente de cero");
		} catch (NullPointerException e) {
			System.out.println("Null pointer");
		}
		System.out.println("Fin aplicacion");
	}
}
