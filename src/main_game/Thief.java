import java.util.Random;

public class Thief implements Job{
	
	private static int hpAdd;
	private static int strengthAdd;
	private static int defenseAdd;
	private static int luckAdd;
	private static int magicAdd;
	private static String name;
	
	Thief() {
		hpAdd = 5;
		strengthAdd = 5;
		defenseAdd = 5;
		luckAdd = 10;
		magicAdd = 4;
		name = "Thief";
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
			player.addHP(4);
			player.addStrength(4);
			player.addDefense(4);
			player.addMagic(3);
			player.addLuck(6);
		} else {
			player.addHP(randomLevelUpStats(5, 3));
			player.addStrength(randomLevelUpStats(4, 2));
			player.addMagic(randomLevelUpStats(3, 1));
			player.addDefense(randomLevelUpStats(4, 2));
			player.addLuck(randomLevelUpStats(8, 5));
		}
		
	}
	
	public int randomLevelUpStats(int max, int min) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}
}
