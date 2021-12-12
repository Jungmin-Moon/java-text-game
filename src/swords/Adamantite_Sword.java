package swords;
import java.util.Random;

import main_game.Weapon;

public class Adamantite_Sword extends Weapon{
	
	private String rarity;
	private String name = "Adamantite Sword";
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	
	public Adamantite_Sword() {
		meleeAtk = 60;
		magicAtk = 0;
		goldSellPrice = 60;
		goldBuyPrice = 100;
		chanceBlock = 70;
		accuracy = 90;
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
		if(chance == 1 || chance == 2 || chance == 3 || chance == 4 || chance == 5 || chance == 6 || chance == 7 || chance == 8 || chance == 9) {
			rarity = "common";
		} else if (chance == 10 || chance == 11 || chance == 12 || chance == 13 || chance == 14) {
			rarity = "rare";
			meleeAtk += 9;
			goldSellPrice += 9;
			chanceBlock += 11;
			accuracy += 11;
		} else if (chance == 15 || chance == 16 || chance == 17) {
			rarity = "epic";
			meleeAtk += 11;
			goldSellPrice += 11;
			chanceBlock += 13;
			accuracy += 13;
		} else if (chance == 18 || chance == 19){
			rarity = "gold";
			meleeAtk += 14;
			goldSellPrice += 14;
			chanceBlock += 16;
			accuracy += 16;
		} else {
			rarity = "legendary";
			meleeAtk += 20;
			goldSellPrice += 30;
			chanceBlock += 24;
			accuracy += 24;
		}
	}
}
