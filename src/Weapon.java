
public class Weapon extends Item{
	
	private String wepType;
	private int wepMeleeAtk;
	private int wepMagAtk;
	private int level;
	private int goldSellPrice;
	private int goldBuyPrice;
	private String rarity; //depending on rarity give bonus stats to main stats same with armor
	
	private final String[] raritiesWep = {"Common", "Rare", "Super Rare", "Ultra Rare"};
	
	
	public Weapon(String wepType, String wepName, int wepMeleeAtk, int wepMagAtk, int level, int goldSellP, 
					int goldBuyP, String rarity) {
		super(wepName);
		this.wepType = wepType;
		this.wepMeleeAtk = wepMeleeAtk;
		this.wepMagAtk = wepMagAtk;
		this.level = level;
		goldSellPrice = goldSellP;
		goldBuyPrice = goldBuyP;
		this.rarity = rarity;
	}
	
	public String getType() {
		return wepType;
	}
	
	public int getMeleeAtk() {
		return wepMeleeAtk;
	}
	
	public int getMagAtk() {
		return wepMagAtk;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getGoldSellPrice() {
		return goldSellPrice;
	}
	
	public int getGoldBuyPrice() {
		return goldBuyPrice;
	}
	
	public String getRarity() {
		return rarity;
	}
	
	//adjust rarity bonus for sword/shield, two-handed, spear, daggers, staff
	//rarity would be common, rare, super rare and ultra rare
	
	
}
