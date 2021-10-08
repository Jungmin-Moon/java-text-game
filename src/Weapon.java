
public class Weapon extends Item{
	
	private String wepType;
	private int wepMeleeAtk;
	private int wepMagAtk;
	private int level;
	private int goldSellPrice;
	private int goldBuyPrice;
	private String rarity; //depending on rarity give bonus stats to main stats same with armor
	
	
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
	
	
}
