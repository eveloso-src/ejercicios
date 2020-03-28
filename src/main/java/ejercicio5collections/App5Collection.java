package ejercicio5collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ejercicios.entidad.Empleado;

// Generar una lista con numeros del 1 al 10 e imprimirlos por pantalla

public class App5Collection {

	public static void main(String[] args) {

//		List<Empleado> list = new ArrayList<Empleado>();
//		for (int i = 1; i < 11; i++) {
//			Empleado emp = new Empleado();
//			emp.setDni(i);
//			list.add(emp);
//		}
//		
//		for(Empleado empl : list) {
//			System.out.println(empl.getDni());
//		}
		
//		
//		Set<Empleado> conj = new HashSet();
//		System.out.println("Total elementos: 1) " + conj.size());
//		Empleado emp = new Empleado();
//		Empleado emp2 = new Empleado();
//		int hash1 = emp.hashCode();
//		int hash2 = emp2.hashCode();
//		emp2.toString();
//		
//		conj.add(emp);
//		System.out.println("Total elementos: 2) " + conj.size());
//		System.out.println("hash1: " + hash1);
//		System.out.println("hash2: " + hash2);
//		conj.add(emp2);
//		System.out.println("Total elementos: 3) " + conj.size());
//		
//		Queue<String> que = new PriorityQueue<String>();
//		System.out.println("Fila: " + que.size());
//		que.add("uno");
//		System.out.println("Fila: " + que.size());
//		que.add("dos");
//		System.out.println(que);
//		System.out.println("Fila: " + que.size());
//		que.poll();
//		System.out.println("Fila: " + que.size());
//		System.out.println(que);
//		
		
		Map<Empleado, Integer> mapa = new HashMap<Empleado, Integer>(); // 30333030 - Juan
		Empleado emp = new Empleado();
		Empleado emp2 = new Empleado();
		System.out.println("Mapa: " + mapa.size());

		mapa.put( emp, 30333030);
		System.out.println("Mapa: " + mapa.size());
		emp2.setNombre("Maria");
		mapa.put(emp2, 30333031);
		System.out.println("Mapa: " + mapa.size());
		Empleado emp3 = new Empleado();
		emp3.setNombre("Ana");
		mapa.put( emp3, 30333032);
		
		System.out.println("Mapa: " + mapa.size());
		
		Set<Empleado> clavesSet = mapa.keySet();
		Iterator<Empleado> it = clavesSet.iterator();
		while (it.hasNext()) {
			Empleado clave = it.next();
			System.out.println("clave: " + clave.getNombre());
			System.out.println("valor: " + mapa.get(clave));
		}
		
	}
	
	
	
	
}
