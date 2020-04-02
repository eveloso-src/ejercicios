package ejercicios.auto;

import ejercicio7.excepciones.auto.Auto;
import ejercicio7.excepciones.auto.AutoDetenidoException;
import ejercicio7.excepciones.auto.ExcesoVelocidadException;
import junit.framework.TestCase;

public class AutoTest extends TestCase{

	public void testAutoAcelerar() {
		Auto au = new Auto();
		try {
			au.acelerar();
			au.acelerar();
		} catch (ExcesoVelocidadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int velo = au.getVelocidad();
		assertTrue(velo == 20);
	}
	
	public void testAutoFrenar() {
		Auto au = new Auto();
		try {
			au.acelerar();
			au.acelerar();
			au.frenar();
			au.frenar();
		} catch (ExcesoVelocidadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AutoDetenidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int velo = au.getVelocidad();
		assertTrue(velo == 0);
	}
}
