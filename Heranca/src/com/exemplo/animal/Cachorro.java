package com.exemplo.animal;
/**
 * Classe Cachorro herda os atributos da classe animal
 * e implementa um novo atributo e metodo : "Latir"
 */
//subclasse
class Cachorro extends Animal  {
	
	private String latido;

	public String getLatido() {
		return latido;
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}

}
