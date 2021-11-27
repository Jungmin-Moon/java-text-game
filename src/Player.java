import java.util.*;

public class Player {
	private String firstName;
	private String lastName;
	private int health;
	private int strength;
	private int defense;
	private int magic;
	private int luck;
	private String currentJob;
	private int level;
	private int currentEXP;
	private int neededEXP;
	
	private List<Item> inventory;
	
	private Item[] gear;
	
	public Player(String fName, String lName) {
		firstName = fName;
		lastName = lName;
		health = 10;
		strength = 4;
		defense = 4;
		magic = 4;
		luck = 4;
		inventory = new ArrayList<>();
		gear = new Item[8];
		level = 1;
		currentEXP = 0;
		neededEXP = 100;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getHP() {
		return health;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getMagic() {
		return magic;
	}
	
	
	public int getLuck() {
		return luck;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getCurEXP() {
		return currentEXP;
	}
	
	public int getNeededEXP() {
		return neededEXP;
	}
	
	public void listInventory() {
		for(Item i : inventory) {
			System.out.println(i);
		}
	}
	
	public void listGear() {
		for(int i = 0; i < gear.length; i++) {
			System.out.println(gear[i]);
		}
	}
	
	public void addHP(int healthToAdd) {
		health += healthToAdd;
	}
	
	public void addStrength(int strToAdd) {
		strength += strToAdd;
	}
	
	public void addDefense(int defToAdd) {
		defense += defToAdd;
	}
	
	public void addMagic(int magToAdd) {
		magic += magToAdd;
	}
	
	public void addLuck(int luckToAdd) {
		luck += luckToAdd;
	}
	
	public void addLevel() {
		level++;
	}
	
	public void setJob(String newJob) {
		currentJob = newJob;
	}
	
	
}
