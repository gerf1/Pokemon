package com.coding.dojo;

public class Pokemon {
	
	public String name;
	public int health;
    public String type;
    public static int count;
    
    
     
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health =+ health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
    
   public Pokemon(String name, int health, String type) {
		count++;
		setName(name);
		setType(type);
		setHealth(health);
	}
public void attackPokemon ( Pokemon pokemon) {
	   pokemon.setHealth(-10);
   }
public Pokemon() {
	
}

}
