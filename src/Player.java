import java.util.*;

public class Player {
	private String firstName;
	private String lastName;
	private int health;
	private int strength;
	private int defense;
	private int magic;
	private int magicDefense;
	private int luck;
	
	private List<Item> inventory;
	
	private Item[] gear;
	
	public Player(String fName, String lName) {
		firstName = fName;
		lName = lastName;
		health = 10;
		strength = 4;
		defense = 4;
		magic = 4;
		magicDefense = 4;
		luck = 4;
		inventory = new ArrayList<>();
		gear = new Item[8];
	}
	
	
}
