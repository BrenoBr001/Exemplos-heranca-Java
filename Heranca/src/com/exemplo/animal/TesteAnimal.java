package com.exemplo.animal;
//Classe de teste
/**
 * @author Breno Amorim
 * classe de teste
 * instanciado 3 novos objetos 
 * com seus atributos herdados da classe animal, e também implementando seus atributos própios.
 */
public class TesteAnimal{
	
	public static void main(String[] args) {
		
	Animal animal = new Animal();
	animal.setLocomove("Todo Animal se locomove");
	animal.setAlimenta("Todo animal se alimenta");
	
	Cachorro rex = new Cachorro();
	rex.setAlimenta("Cachorro come ração para cachorros");
	rex.setLocomove("Cachorro se locomove usando suas quatro patas");
	rex.setLatido("Cachorro faz Au Au");
	
	Animal husky = new Cachorro();
	husky.setAlimenta("Husky come ração para cachorros");
	husky.setLocomove("Husky se locomove usando suas quatro patas");

}
		
	
}
