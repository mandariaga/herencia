package org.rima.herencia;

public class Main {
	
	public static void main(String[] args) {
		Sedan s;
		s = new Sedan(false);
		s.bencinaDisponible = 10f;
		Auto a = new Auto(10f);
		for (int i = 0; i < 10; i++){
			System.out.println("Resto bencina de Sedan: "+s.descontarBencina());
			System.out.println("Resto bencina de Auto: "+a.descontarBencina());
			
		}
		Auto a2 = new Sedan(false);
			}

}
