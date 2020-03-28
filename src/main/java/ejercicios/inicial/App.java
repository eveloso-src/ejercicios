package ejercicios.inicial;

import java.util.Scanner;

import ejercicios.entidad.Cliente;
import ejercicios.entidad.Empleado;
import ejercicios.entidad.Persona;

// Crear un paquete llamado ejercicio.entidad
// y las subclases de Persona:
// Empleado (float sueldo)
// Cliente (String cuit)
public class App {

	// Tomar datos por teclado y generar un empleado o una persona segun 
	// seleccione y mostrar los datos por pantalla
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cliente cliente = new Cliente();
		System.out.println("Ingrese total venta : ");
		float ventaTotal = sc.nextFloat();
		float totalNeto = cliente.getDescuento(ventaTotal);
		
		System.out.println("Total neto venta cliente: " + totalNeto);
		
		Empleado empleado = new Empleado();
		float totalNetoEmpleado = empleado.getDescuento(ventaTotal);
		System.out.println("Total neto venta empleado: " + totalNetoEmpleado);
		
	}
}
