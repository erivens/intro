package enumExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level h = Level.HIGH;
		Level m = Level.MEDIUM;
		Level l = Level.LOW;
		
		System.out.println(h.getLvl());
		System.out.println(m.getLvl());
		System.out.println(l.getLvl());
		
		l.setLvl(2);
		System.out.println(l.getLvl());
		
	}

}
