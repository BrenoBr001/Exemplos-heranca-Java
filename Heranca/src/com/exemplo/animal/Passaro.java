package com.exemplo.animal;

/**
 * Classe Passaro herda os atributos da classe animal
 * e implementa um novo atributo e metodo : "pia"
 */
//subclasse
public class Passaro extends Animal{

	private String pia;

	public String getPia() {
		return pia;
	}

	public void setPia(String pia) {
		this.pia = pia;
	}
	
	
}
