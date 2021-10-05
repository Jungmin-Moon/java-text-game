
public class Armor extends Item{
	
	//head, body, gloves, pants, feet, ring1, ring2
	private String armorType;
	private int meleeDefense;
	private int magicDefense;
	private int goldSellPrice;
	private int goldBuyPrice;
	private String rarity;
	
	public Armor(String armorName) {
		super(armorName);
	}
}
