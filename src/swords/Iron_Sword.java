package swords;
import java.util.Random;

import main_game.Weapon;

public class Iron_Sword extends Weapon{

	private String rarity;
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	
	
	public Iron_Sword(String itemName) {
		super(itemName);
		rarity = "common";
		meleeAtk = 10;
		magicAtk = 0;
		goldSellPrice = 10;
		goldBuyPrice = 15;
		chanceBlock = 12;
		accuracy = 50;
		
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

	public int getGoldBuyPrice() {
		return goldBuyPrice;
	}

	public int getGoldSellPrice() {
		return goldSellPrice;
	}
	
	public int getChanceBlock() {
		return chanceBlock;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	
	public void rarityChance() {
		int chance = rarityUpgradeNum();
		if(chance == 1 || chance == 3 || chance == 5) {
			rarity = "common";
		} else {
			rarity = "rare";
			meleeAtk += 2;
			goldSellPrice += 3;
			chanceBlock += 5;
			accuracy += 5;
		}
		
	}
	
	public int rarityUpgradeNum() {
		Random random = new Random();
		return random.nextInt(6 - 1) + 1;
	}

}
