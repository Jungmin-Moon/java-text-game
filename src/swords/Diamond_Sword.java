package swords;
import java.util.Random;

import main_game.Weapon;

public class Diamond_Sword extends Weapon{
	
	private String rarity;
	private int meleeAtk;
	private int magicAtk;
	private int goldSellPrice;
	private int goldBuyPrice;
	private int chanceBlock;
	private int accuracy;
	
	public Diamond_Sword(String itemName) {
		super(itemName);
		
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
	
	
}
