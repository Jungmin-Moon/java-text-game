package swords;
import java.util.Random;

import main_game.Weapon;

public class Fire_Sword extends Weapon{
	
	private String rarity;
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	
	public Fire_Sword(String itemName) {
		super(itemName);
		meleeAtk = 25;
		magicAtk = 0;
		goldSellPrice = 20;
		goldBuyPrice = 40;
		chanceBlock = 20;
		accuracy = 65;
		rarity = "common";
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
	
	public int getGoldSellPrice() {
		return goldSellPrice;
	}
	
	public int getGoldBuyPrice() {
		return goldBuyPrice;
	}
	
	public int getChanceBlock() {
		return chanceBlock;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public int rarityUpgradeNum() {
		Random random = new Random();
		return random.nextInt(10 - 1) + 1;
	}
	
	
	public void rarityChance() {
		int chance = rarityUpgradeNum();
		if(chance == 1 || chance == 2 || chance == 3) {
			rarity = "common";
		} else if (chance == 4 || chance == 5 || chance == 6 || chance == 7 || chance == 8) {
			rarity = "rare";
			meleeAtk += 5;
			goldSellPrice += 5;
			chanceBlock += 6;
			accuracy += 6;
		} else {
			rarity = "epic";
			meleeAtk += 8;
			goldSellPrice += 8;
			chanceBlock += 6;
			accuracy += 6;
		}
	}
}
