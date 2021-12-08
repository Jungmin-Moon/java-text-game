package main_game;

public class Item {
	
	
	private int itemQuantity;
	
	
	public Item() {
		itemQuantity = 0;
	}
	
	/*
	public String getItemName() {
		return itemName;
	} */
	
	public int getQuantity() {
		return itemQuantity;
	}
	
	public void addQuantity(int howManyToAdd) {
		itemQuantity += howManyToAdd;
	}
}
