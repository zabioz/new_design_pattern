package SingleTon;

public class Satan {
	private static Satan satan = new Satan();
	private int hp;
	
	private Satan() {
		hp = 100;		
	}

	public static Satan getInstance() {
		if(satan == null) {
			satan = new Satan();
		}
		return satan;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}



