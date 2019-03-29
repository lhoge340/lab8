import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for BoardGame class.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class BoardGameTest {
	
	/**
	 * Test for addPlayer method
	 */
	@Test
	public void addPlayerTest()
	{
		BoardGame monopoly = new BoardGame();
		
		monopoly.addPlayer("John", GamePiece.RED_RACER, Location.BALLROOM);
		monopoly.addPlayer("Natalia", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		
		Assert.assertEquals("addPlayer incorrect", true, monopoly.addPlayer("Matt", GamePiece.YELLOW_BOOT, 
				Location.BILLIARD_ROOM));
		Assert.assertEquals("addPlayer incorrect", false, monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, 
				Location.BALLROOM));
		
	}
	
	/**
	 * Test for getPlayerGamePiece method
	 */
	@Test
	public void getPlayerGamePieceTest()
	{
		BoardGame monopoly = new BoardGame();
		
		monopoly.addPlayer("John", GamePiece.RED_RACER, Location.BALLROOM);
		monopoly.addPlayer("Natalia", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		
		Assert.assertEquals("getPlayerGamePiece incorrect", GamePiece.BLUE_BOOT, 
				monopoly.getPlayerGamePiece("Natalia"));
	}
	
	/**
	 * Test for getPlayerWithGamePiece
	 */
	@Test
	public void getPlayerWithGamePieceTest()
	{
		BoardGame monopoly = new BoardGame();
		
		monopoly.addPlayer("John", GamePiece.RED_RACER, Location.BALLROOM);
		monopoly.addPlayer("Natalia", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		
		Assert.assertEquals("getPlayerWithGamePiece incorrect", "John", 
				monopoly.getPlayerWithGamePiece(GamePiece.RED_RACER));
		
		Assert.assertEquals("getPlayerWithGamePiece incorrect", null, 
				monopoly.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
	}
	
	/**
	 * Test for movePlayerTest and getPlayersLocation
	 */
	@Test
	public void movePlayerTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.BALLROOM);
		
		monopoly.movePlayer("Noa", Location.STUDY);
		
		Assert.assertEquals("movePlayerTest incorrect", Location.STUDY, monopoly.getPlayersLocation("Noa"));
	}
	
	
	/**
	 * Test for moveTwoPlayers
	 */
	@Test
	public void moveTwoPlayersTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Matt", GamePiece.YELLOW_BOOT, Location.CONSERVATORY);
		
		String[] playerNames = new String[2];
		playerNames[0] = "Noa";
		playerNames[1] = "Matt";
		
		Location[] newLocations = new Location[2];
		newLocations[0] = Location.BILLIARD_ROOM;
		newLocations[1] = Location.BALLROOM;
		
		monopoly.moveTwoPlayers(playerNames, newLocations);
				
		Assert.assertEquals("MoveTwoPlayers incorrect", "Matt", playerNames[0]);
		
	}
	
	/**
	 * Test for getPlayersAtLocation
	 */
	@Test
	public void getPlayersAtLocationTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Robert", GamePiece.YELLOW_BOOT, Location.BALLROOM);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.HALL);
		monopoly.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
		monopoly.addPlayer("Matt", GamePiece.GREEN_BOOT, Location.HALL);
		
		
		ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();
		
		expected.add("Noa");
		expected.add("Nigh");
		expected.add("Matt");
		
		actual = monopoly.getPlayersAtLocation(Location.HALL);
		
		Assert.assertEquals("getPlayersAtLocation incorrect", true, expected.equals(actual));
		
	}
	
	/**
	 * Test for getGamePiecesAtLocation
	 */
	@Test
	public void getGamePiecesAtLocation()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Robert", GamePiece.YELLOW_BOOT, Location.BALLROOM);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.HALL);
		monopoly.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
		monopoly.addPlayer("Matt", GamePiece.GREEN_BOOT, Location.HALL);
		
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>();
		ArrayList<GamePiece> actual = new ArrayList<GamePiece>();
		
		expected.add(GamePiece.RED_THIMBLE);
		expected.add(GamePiece.BLUE_BOOT);
		expected.add(GamePiece.GREEN_BOOT);
		
		actual = monopoly.getGamePiecesAtLocation(Location.HALL);
		
		Assert.assertEquals("getGamePiecesAtLocation incorrect", true, expected.equals(actual));
		
	}
	
	/**
	 * Test for getPlayers
	 */
	@Test
	public void getPlayersTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Robert", GamePiece.YELLOW_BOOT, Location.BALLROOM);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.HALL);
		monopoly.addPlayer("Rosie", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
		monopoly.addPlayer("Matt", GamePiece.GREEN_BOOT, Location.HALL);
		
		Set<String> expected = new LinkedHashSet<String>();
		Set<String> actual = new LinkedHashSet<String>();
		
		expected.add("Noa");
		expected.add("Robert");
		expected.add("Nigh");
		expected.add("Rosie");
		expected.add("Matt");
		
		actual = monopoly.getPlayers();
		
		Assert.assertEquals("getPlayers incorrect", expected, actual);
		
	}
	
	/**
	 * Test for getPlayerLocations
	 */
	@Test
	public void getPlayerLocationsTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Robert", GamePiece.YELLOW_BOOT, Location.BALLROOM);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.CONSERVATORY);
		
		Set<Location> expected = new LinkedHashSet<Location>();
		Set<Location> actual = new LinkedHashSet<Location>();
		
		expected.add(Location.HALL);
		expected.add(Location.BALLROOM);
		expected.add(Location.CONSERVATORY);
		
		actual = monopoly.getPlayerLocations();
		
		Assert.assertEquals("getPlayerLocations incorrect", expected, actual);	
	}
	
	/**
	 * Test for getPlayerPieces
	 */
	@Test
	public void getPlayerPiecesTest()
	{
		BoardGame monopoly = new BoardGame();

		monopoly.addPlayer("Noa", GamePiece.RED_THIMBLE, Location.HALL);
		monopoly.addPlayer("Robert", GamePiece.YELLOW_BOOT, Location.BALLROOM);
		monopoly.addPlayer("Nigh", GamePiece.BLUE_BOOT, Location.CONSERVATORY);
		
		Set<GamePiece> expected = new LinkedHashSet<GamePiece>();
		Set<GamePiece> actual = new LinkedHashSet<GamePiece>();
		
		expected.add(GamePiece.RED_THIMBLE);
		expected.add(GamePiece.YELLOW_BOOT);
		expected.add(GamePiece.BLUE_BOOT);
		
		actual = monopoly.getPlayerPieces();
		
		Assert.assertEquals("getPlayerPieces incorrect", expected, actual);
	}


}
