package ejercicio9.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AppJDBC {

	public static void main(String[] args) {
		try {
			Connection conection = AdminBD.obtenerConexion();
			System.out.println("SISTEMA DE ABM DE EMPLEADOS");
			System.out.println("1:alta 2:modificacion 3:baja 4:listado 0:salir");
			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			while (opcion != 0) {

				switch (opcion) {
				case 1:
					insertar(conection, sc);
					break;
				case 2:
					modificar(conection, sc);
					break;
				case 3:
					break;
				case 4:
					listar(conection);
					break;

				}
				System.out.println("1:alta 2:modificacion 3:baja 4:listado 0:salir");
				opcion = sc.nextInt();
			}
			sc.close();
			conection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No se pudo realizar la operacion " + e.getMessage());
		}
	}

	private static void modificar(Connection conection, Scanner sc) throws SQLException {
		Statement stmt = conection.createStatement();
		System.out.println("Ingrese id a modificar:");
		int id = sc.nextInt();
		
		// verificar si existe el id
		// si no existe --> mostrar mensaje de no existe id
		Emplyee buscado = buscar(conection, id);
		
		if (buscado == null) {
			// Mensaje no encontrado
			
		}
		else {
			
			System.out.println("Ingrese email:");
			String email = sc.next();
			System.out.println("Ingrese nombre:");
			String nombre = sc.next();
			System.out.println("Ingrese apellido:");
			String apellido = sc.next();
			
			// leer los demas campos
			
			String insertSql = "update employee set email = '" + email + "', first_name = '" + nombre + "', last_name = '"
					+ apellido + "' where id = " + id;
			stmt.executeUpdate(insertSql);
			
			System.out.println("Registro actualizado");
		}
	}

	private static void insertar(Connection conection, Scanner sc) throws SQLException {
		Statement stmt = conection.createStatement();
		System.out.println("Ingrese email:");
		String email = sc.next();

		// leer los demas campos

		String insertSql = "insert into employee (email, `FIRST_NAME` , `LAST_NAME` ) values ('" + email
				+ "', 'LunesTest', 'ApeLunes');\r\n";
		stmt.executeUpdate(insertSql);
		System.out.println("Registro ingresado");
	}

	private static void listar(Connection conection) throws SQLException {

		Statement stmt = conection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		while (rs.next()) {
			int id = rs.getInt(1);
			String mail = rs.getString(2);
			String name = rs.getString(3);
			String last = rs.getString(4);
			System.out.println(id + " " + mail + " " + name + " " + last);
		}
	}
	
	private static Emplyee buscar(Connection con, int id) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee where id = " + id);
		Emplyee emp = null;
		while (rs.next()) {
			emp = new Emplyee();
			emp.setEmail(rs.getString(2));
			emp.setFirstName(rs.getString(3));
			emp.setLastName(rs.getString(4));
			emp.setId(rs.getInt(1));
		}
		return emp;
	}
}
