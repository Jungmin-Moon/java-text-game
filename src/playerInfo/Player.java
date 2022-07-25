package playerInfo;


	//Needs a way to track inventory
	//Needs way to track equipped and work with inventory
	
public class Player {
	
	//all default values will be done prior to creation of character
	String playerName;
	int playerStrength = 5;
	int playerMagic = 5;
	int playerLuck = 5;
	int playerDef = 5;
	int playerHP = 20;
	int playerAgility = 5;
	
	
	Player(String name) {
		playerName = name;
	}
	
	
	//setters and getters for player stats
	public String getPlayerName() {
		return playerName;
	}
	
	public int getStrength() {
		return playerStrength;
	}
	
	public int getMagic() {
		return playerMagic;
	}
	
	public int getLuck() {
		return playerLuck;
	}
	
	public int getDef() {
		return playerDef;
	}
	
	public int getHP() {
		return playerHP;
	}
	
	public int getAgility() {
		return playerAgility;
	}
	
	
	public void setPlayerName(String newName) {
		playerName = newName;
	}
	
	public void addStrength(int addStrength) {
		playerStrength += addStrength;
	}
	
	public void addMagic(int addMagic) {
		playerMagic += addMagic;
	}
	
	public void addLuck(int addLuck) {
		playerLuck += addLuck;
	}
	
	public void addDef(int addDef) {
		playerDef += addDef;
	}
	
	public void addHP(int addHP) {
		playerHP += addHP;
	}
	
	public void addAgility(int addAgility) {
		playerAgility += addAgility;
	}
	
}
