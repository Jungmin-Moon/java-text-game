
public class Weapon extends Item{
	
	private String wepType;
	private int wepMeleeAtk;
	private int wepMagAtk;
	private int level;
	private int goldSellPrice;
	private int goldBuyPrice;
	private String rarity; //depending on rarity give bonus stats to main stats same with armor
	
	
	public Weapon(String wepName) {
		super(wepName);
	}
}
