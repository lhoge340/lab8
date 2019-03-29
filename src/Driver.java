/**
 * Lab 8
 * 
 * The Driver for the BoardGame class
 * 
 * @author Lyndee
 * @version 2019-03-28
 */
public class Driver {

	public static void main(String[] args) {
		 
		BoardGame monopoly = new BoardGame();
		
		monopoly.addPlayer("John", GamePiece.RED_RACER, Location.BALLROOM);
		monopoly.addPlayer("Natalia", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Gianni", GamePiece.GREEN_BOOT, Location.CONSERVATORY);
		monopoly.addPlayer("Matt", GamePiece.YELLOW_BOOT, Location.BILLIARD_ROOM);
		
		System.out.println(monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL));
		System.out.println(monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.BALLROOM));
		
		System.out.println(GamePiece.RED_RACER.toString());

	}

}
