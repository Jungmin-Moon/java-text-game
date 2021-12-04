package main_game;
import java.util.Random;

public class Warrior implements Job{
	
	private static int hpAdd;
	private static int strengthAdd;
	private static int defenseAdd;
	private static int luckAdd;
	private static int magicAdd;
	private static String name;
	
	Warrior () {
		hpAdd = 6;
		strengthAdd = 5;
		defenseAdd = 6;
		luckAdd = 1;
		magicAdd = 0;
		name = "Warrior";
	}
	
	

	@Override
	public void addStats(Player player) {
		player.addHP(hpAdd);
		player.addStrength(strengthAdd);
		player.addDefense(defenseAdd);
		player.addMagic(magicAdd);
		player.addLuck(luckAdd);
		player.setJob(name);
	}

	@Override
	public void levelUpStatAdd(Player player) {
		if(player.getLevel() < 51) {
			player.addHP(6);
			player.addStrength(4);
			player.addDefense(6);
			player.addMagic(1);
			player.addLuck(2);
		} else {
			player.addHP(randomLevelUpStats(8, 5));
			player.addStrength(randomLevelUpStats(6, 3));
			player.addMagic(randomLevelUpStats(1, 0));
			player.addDefense(randomLevelUpStats(8, 5));
			player.addLuck(randomLevelUpStats(4, 2));
		}
		
	}
	
	public int randomLevelUpStats(int max, int min) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

}
