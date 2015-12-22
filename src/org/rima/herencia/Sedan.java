package org.rima.herencia;

public class Sedan extends Auto {

	boolean turbo; 
	public Sedan (boolean t){
		turbo = t;
		
	}
	@Override
	public Float descontarBencina(){
		bencinaDisponible = bencinaDisponible - 5;
		return bencinaDisponible;
	}
}
