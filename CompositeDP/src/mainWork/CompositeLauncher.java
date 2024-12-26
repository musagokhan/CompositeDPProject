package mainWork;

import java.util.List;

public class CompositeLauncher implements ComponentShow {
	
	private final int bulletNum; 
	private final List<ComponentShow> bullets;
	
	public CompositeLauncher(int bulletNum, List<ComponentShow> bullets) {
	    this.bulletNum = bulletNum;
	    this.bullets = bullets;
	}

	@Override
	public void showDetails() {
	    System.out.println("The system Bullet number is " + this.bulletNum);
	    System.out.println("The Bullets detail info:");
	    for (ComponentShow bullet : bullets) {
	        bullet.showDetails();
	    }
	}

}
