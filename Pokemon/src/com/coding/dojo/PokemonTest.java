package com.coding.dojo;

public class PokemonTest {

	public static void main(String[] args) {
		 Pokedex pokedex = new Pokedex();
	      Pokemon attack = new Pokemon();
	      Pokemon charmander = pokedex.createPokemon("Charmander", 130, "fire");
	      Pokemon pikachu = pokedex.createPokemon("pikachu", 80, "electric");
	      
	      
	      pokedex.pokemonInfo(charmander);
	      pokedex.pokemonInfo(pikachu);
	      pokedex.listPokemon();
	      
	      attack.attackPokemon(charmander);
	      attack.attackPokemon(pikachu);
	      
	      pokedex.pokemonInfo(charmander);
	      pokedex.pokemonInfo(pikachu);

	}

}
