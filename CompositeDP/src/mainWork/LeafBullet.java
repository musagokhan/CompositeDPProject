package mainWork;

public class LeafBullet implements ComponentShow {
	
	private final String type;
	private final double range;

	public LeafBullet (String type, double range) {
		this.type = type;
		this.range = range;
	}

	@Override
	public void showDetails() {
		System.out.println("Bullet type is " + this.type + " and Range = " + this.range);
	}

}
