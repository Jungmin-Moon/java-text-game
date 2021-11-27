
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelUpStatAdd(Player player) {
		// TODO Auto-generated method stub
		
	}

}
