package enumExample;

public enum Level {
	HIGH(10),
	MEDIUM(5),
	LOW(1);
	
	private int lvlNum;
	private Level(int num) {
		this.lvlNum = num;
	}
	public int getLvl() {
		return this.lvlNum;
	}
	public void setLvl(int num) {
		this.lvlNum = num;
	}

}
