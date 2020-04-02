package ejercicios.banco;

import ejercicio7.excepciones.banco.CajaAhorro;
import ejercicio7.excepciones.banco.SaldoException;
import junit.framework.TestCase;

public class TestBanco extends TestCase {

	public void testDepositoCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		ca.depositar(2);
		assertTrue(ca.getSaldo() == 102);
	}
	
	public void testRetiroCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		try {
			ca.extraer(101);
		} catch (SaldoException e) {
			
		}
		assertTrue(ca.getSaldo() == 100);
	}
}
