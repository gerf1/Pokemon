package com.coding.dojo;

public  class Pokedex extends PokemonAbstract {
	
	Pokemon list = new Pokemon();
	public int myPokemons;


	public void listPokemon() {
		this.myPokemons = list.count;
		System.out.println("There are "+myPokemons+" Pokemons");
	}


	@Override
	public void attackPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		
	}}



