package br.com.generation.animal02;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
		animal.som();
		
		System.out.println();
		
		animal = new Cavalo();
		animal.som();
		
		System.out.println();
		
		animal = new Preguica();
		animal.som();
		

	}

}
