package swords;
import java.util.Random;

import main_game.Weapon;

public class Gold_Sword extends Weapon {
	
	private String rarity;
	private String name = "Gold Sword";
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	

	public Gold_Sword() {
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
	
	
	//for this can do numbers 1-15 where only 15 is gold 
	//1 - 7 is staying common
	//8 - 11 rare
	//12 - 14 is epic 
	
	public void rarityChance() {
		int chance = rarityUpgradeNum();
		if(chance == 1 || chance == 2 || chance == 3 || chance == 4 || chance == 5 || chance == 6 || chance == 7) {
			rarity = "common";
		} else if (chance == 8 || chance == 9 || chance == 10 || chance == 11) {
			rarity = "rare";
			meleeAtk += 5;
			goldSellPrice += 5;
			chanceBlock += 6;
			accuracy += 6;
		} else if (chance == 12 || chance == 13 || chance == 14) {
			rarity = "epic";
			meleeAtk += 8;
			goldSellPrice += 8;
			chanceBlock += 6;
			accuracy += 8;
		} else {
			rarity = "gold";
			meleeAtk += 12;
			goldSellPrice += 12;
			chanceBlock += 10;
			accuracy += 10;
		}
	}
}
