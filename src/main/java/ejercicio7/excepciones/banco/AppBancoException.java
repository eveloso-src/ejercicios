package ejercicio7.excepciones.banco;

import java.util.Scanner;

/*
 * Un cliente de un banco puede tener dos tipos de cuenta (caja de 
 * ahorro y cuenta corriente). Ambas tienen numero y saldo pero 
 * la cuenta corriente tambien tiene descubierto (importe habilitado
 * para que la cuenta quede en negativo).
 * Inicializamos las cuentas de un cliente en cero y con un descubierto de 
 * 100.
 * Luego intentamos hacer extracciones solicitando el importe 
 * al usuario
 * Si no puede realizarse la operacion, debe lanzar una excepcion.
 * Tambien puede depositar en la cuenta
 * Mostrar el saldo actualizado
 */
public class AppBancoException {

	private static CajaAhorro ca = new CajaAhorro("001", 0);
	private static CuentaCorriente cc = new CuentaCorriente("002", 0, 100);
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Sistema de banco");
		System.out.println();

		System.out.println("Opciones: 1. deposito 2. extraccion 0. salir");
		int opcion = sc.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				deposito();
				break;
			case 2:
				extraccion();
				break;

			}

			System.out.println("Opciones: 1. deposito 2. extraccion 0. salir");
			opcion = sc.nextInt();
		}
	}

	private static void extraccion() {
		System.out.println("Opciones: 1. C.Ahorro 2. C.Corriente");
		int cuenta = sc.nextInt();
		System.out.println("Ingrese importe");
		float importe = sc.nextFloat();

		if (cuenta == 1) {
			try {
				ca.extraer(importe);
			} catch (SaldoException e) {
				System.out.println(e.getMessage());
			}
		} else {
			try {
				cc.extraer(importe);
			} catch (SaldoException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	private static void deposito() {
		System.out.println("Opciones: 1. C.Ahorro 2. C.Corriente");
		int cuenta = sc.nextInt();
		System.out.println("Ingrese importe");
		float importe = sc.nextFloat();

		if (cuenta == 1) {
			ca.depositar(importe);
		} else {
			cc.depositar(importe);
		}

	}

}
