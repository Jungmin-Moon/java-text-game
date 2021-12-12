package swords;
import java.util.Random;

import main_game.Weapon;

public class Holy_Sword extends Weapon{
	
	private String rarity;
	private String name = "Holy Sword";
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	

	public Holy_Sword() {
		meleeAtk = 40;
		magicAtk = 0;
		goldSellPrice = 40;
		goldBuyPrice = 70;
		chanceBlock = 50;
		accuracy = 70;
		rarity = "common";
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
		if(chance == 1 || chance == 2 || chance == 3 || chance == 4 || chance == 5 || chance == 6 || chance == 7) {
			rarity = "common";
		} else if (chance == 8 || chance == 9 || chance == 10 || chance == 11) {
			rarity = "rare";
			meleeAtk += 8;
			goldSellPrice += 8;
			chanceBlock += 10;
			accuracy += 10;
		} else if (chance == 12 || chance == 13 || chance == 14) {
			rarity = "epic";
			meleeAtk += 10;
			goldSellPrice += 10;
			chanceBlock += 12;
			accuracy += 12;
		} else {
			rarity = "gold";
			meleeAtk += 12;
			goldSellPrice += 12;
			chanceBlock += 14;
			accuracy += 14;
		}
	}

}
