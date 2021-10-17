
public class Armor extends Item{
	
	//head, body, gloves, pants, feet, ring1, ring2
	private String armorType;
	private int meleeDefense;
	private int magicDefense;
	private int goldSellPrice;
	private int goldBuyPrice;
	private String rarity;
	
	private final String[] raritiesArmor = {"Common", "Rare", "Super Rare", "Ultra Rare"};
	
	public Armor(String armorName, String armorType, int melDef, int magDef, int goldSellP, int goldBuyP, 
				String rarity) {
		super(armorName);
		this.armorType = armorType;
		meleeDefense = melDef;
		magicDefense = magDef;
		goldSellPrice = goldSellP;
		goldBuyPrice = goldBuyP;
		this.rarity = rarity;
	}
	
	public String getArmorType() {
		return armorType;
	}
	
	public int getMeleeDef() {
		return meleeDefense;
	}
	
	public int getMagDef() {
		return magicDefense;
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
}
