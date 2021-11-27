
public class Warrior implements Job{
	
	private int hpAdd;
	private int strengthAdd;
	private int defenseAdd;
	private int luckAdd;
	private int magicAdd;
	private String name;
	
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
		
		
	}

	@Override
	public void levelUpStatAdd(Player player) {
		
		
	}

}
