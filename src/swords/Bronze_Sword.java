package swords;
import java.util.Random;

import main_game.Weapon;

public class Bronze_Sword extends Weapon{
	
	private String rarity;
	private String name = "Bronze Sword";
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	

	public Bronze_Sword() {
		rarity = "common";
		meleeAtk = 5;
		magicAtk = 0;
		goldSellPrice = 5;
		goldBuyPrice = 8;
		chanceBlock = 10;
		accuracy = 50;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRarity() {
		return rarity;
	}
	
	public int getMeleeAtk() {
		return meleeAtk;
	}
	
	public int getMagicAtk() {
		return magicAtk;
	}
	
	public int getSellPrice() {
		return goldSellPrice;
	}
	
	public int getBuyPrice() {
		return goldBuyPrice;
	}
	
	public int getChanceBlock() {
		return chanceBlock;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	
	
	/*
	 * rare for weapons like swords, spears, axes and maces should get set stat ups at each tier 
	 * being rare, epic, gold and legendary
	 * 
	 */
	public void rarityChance() {
		int chance = rarityUpgradeNum();
		if(chance == 1 || chance == 3 || chance == 5) {
			rarity = "common";
		} else {
			rarity = "rare";
			meleeAtk += 1;
			goldSellPrice += 2;
			chanceBlock += 5;
			accuracy += 5;
		}
		
	}
	
	public int rarityUpgradeNum() {
		Random random = new Random();
		return random.nextInt(6 - 1) + 1;
	}

}
