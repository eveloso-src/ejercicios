package ejercicio9.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ejercicio9.jdbc.Employee;

public class EmployeeDao {

	public static void modificar(Employee employee, Statement stmt) throws SQLException {
		String insertSql = "update employee set email = '" + employee.getEmail() + "', first_name = '"
				+ employee.getFirstName() + "', last_name = '" + employee.getLastName() + "' where id = "
				+ employee.getId();
		stmt.executeUpdate(insertSql);
	}

	public static void insertar(Employee employee, Statement stmt) throws SQLException {
	}
	
	public static void eliminar(Employee employee, Statement stmt) throws SQLException {
		stmt.executeUpdate("delete from employee where id = " + employee.getId());
	}
	
	public static List<Employee> listar(Statement stmt) throws SQLException {
		return null;
	}
	
	public static Employee buscar(Statement stmt, int id) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from employee where id = " + id);
		Employee emp = null;
		while (rs.next()) {
			emp = new Employee();
			emp.setEmail(rs.getString(2));
			emp.setFirstName(rs.getString(3));
			emp.setLastName(rs.getString(4));
			emp.setId(rs.getInt(1));
		}
		return emp;
	}
	
}
