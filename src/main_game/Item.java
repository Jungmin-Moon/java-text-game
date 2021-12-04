
public class Item {
	
	
	private String itemName;
	private int itemQuantity;
	
	
	public Item(String itemName) {
		this.itemName = itemName;
		itemQuantity = 0;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
	
	public void addQuantity(int howManyToAdd) {
		itemQuantity += howManyToAdd;
	}
}
