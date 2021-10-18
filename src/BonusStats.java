
public class BonusStats {
	private String rarity;
	private String wepType;
	private String bonusText;
	private String armorType;
	
	private int bonusHP;
	private int bonusStr;
	private int bonusDef;
	private int bonusMag;
	private int bonusMagDef;
	private int bonusLuck;
	private int bonusMeleeAtk;
	private int bonusMagAtk;
	private int bonusMeleeDef;
	private int bonusArmMagDef;
	private int bonusGoldSellPrice;
	
	BonusStats(String rarity, String wepType, String armorType, String bonusText, int bonusHP, int bonusStr, 
				int bonusDef, int bonusMag, int bonusMagDef, int bonusLuck, int bonusMelAtk, int bonusMagAtk,
				int bonusMeleeDef, int bonusArmMagDef, int bonusGoldSellPrice) {
		this.rarity = rarity;
		this.wepType = wepType;
		this.armorType = armorType;
		this.bonusText = bonusText;
		this.setBonusHP(bonusHP);
		this.bonusStr = bonusStr;
		this.bonusDef = bonusDef;
		this.bonusMag = bonusMag;
		this.bonusMagDef = bonusMagDef;
		this.bonusLuck = bonusLuck;
		bonusMeleeAtk = bonusMelAtk;
		this.bonusMagAtk = bonusMagAtk;
		this.bonusMeleeDef = bonusMeleeDef;
		this.bonusArmMagDef = bonusArmMagDef;
		this.bonusGoldSellPrice = bonusGoldSellPrice;
	}

	public int getBonusHP() {
		return bonusHP;
	}

	public void setBonusHP(int bonusHP) {
		this.bonusHP = bonusHP;
	}
	
	
}
