package gameItems;

/*
 * Creation of items package and the item class
 * Weapons armor etc will need to extend off base item which will be simple and have their own properties
 * consumables will also need to extend and branch off into their own trees with their own properties as well
 * 
 * Question becomes do i create a database of items first and then create the classes or instead of classes just use the database 
 */
public class Item {
	//Every item will always have some sort of gold value and a name
	//all subsequent items will have their own properties unique to them like consumables and armors and weapons
	String name;
	int goldValue;
	
	Item (String name, int goldValue) {
		this.name = name;
		this.goldValue = goldValue;
	}
	
	//getters and setters 
	public String getItemName() {
		return name;
	}
	
	public int getGoldValue() {
		return goldValue;
	}
	
	
	//setters
	public void setNewItemName(String newItemName) {
		name = newItemName;
	}
	
	public void setNewGoldValue(int newGoldValue) {
		goldValue = newGoldValue;
	}
}
