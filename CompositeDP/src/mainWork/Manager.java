package mainWork;

import java.util.List;

public class Manager {

	public static void main(String[] args) {

		int bulletNum = 2;
		LeafBullet firstLeafBullet = new LeafBullet("RF", 250);
		LeafBullet secondLeafBullet = new LeafBullet("IR", 350);
		List<ComponentShow> bullets = List.of(firstLeafBullet, secondLeafBullet);
		
		CompositeLauncher gunSystem = new CompositeLauncher(bulletNum, bullets);
		gunSystem.showDetails();

	}

}
