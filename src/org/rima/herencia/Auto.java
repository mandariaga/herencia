package org.rima.herencia;

public class Auto {
	String motor;
	Float largo;
	Float ancho;
	Float cilindrada;
	Float potencia;
	String tipoCambio;
	Float bencinaDisponible;
	public Auto() {
		super();
	}
	public Auto(String m, Float l, Float a, Float c, Float potencia, String tipoCambio){
		motor = m;
		largo = l;
		ancho = a;
		cilindrada = c;
		this.potencia = potencia;
		this.tipoCambio = tipoCambio;
	}
	public Auto(Float bd){
		bencinaDisponible = bd;
	}
	public Float descontarBencina() {
		bencinaDisponible = bencinaDisponible -1;
		return bencinaDisponible;
	}
}
