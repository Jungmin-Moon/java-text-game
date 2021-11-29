import java.util.Random;

public class Mage implements Job{
	private static int hpAdd;
	private static int strengthAdd;
	private static int defenseAdd;
	private static int luckAdd;
	private static int magicAdd;
	private static String name;
	
	Mage() {
		hpAdd = 3;
		strengthAdd = 1;
		defenseAdd = 2;
		magicAdd = 6;
		luckAdd = 2;
		name = "Mage";
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
			player.addHP(randomLevelUpStats(5, 3));
			player.addStrength(randomLevelUpStats(2, 0));
			player.addMagic(randomLevelUpStats(8, 5));
			player.addDefense(randomLevelUpStats(4, 2));
			player.addLuck(randomLevelUpStats(4, 2));
		}
		
	}
	
	public int randomLevelUpStats(int max, int min) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

}
