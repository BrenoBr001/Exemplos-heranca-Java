package com.exemplo.animal;

/**
 * @author Breno Amorim
 * Classe animal para exemplificar Herança em POO
 * Classe possui os atributos locomover e Alimentar
 */
public class Animal {
	
	private String locomove;
	private String alimenta;
	
	public String getLocomove() {
		return locomove;
	}
	public void setLocomove(String locomove) {
		this.locomove = locomove;
	}
	
	public String getAlimenta() {
		return alimenta;
	}
	
	public void setAlimenta(String alimenta) {
		this.alimenta = alimenta;
	}

}
