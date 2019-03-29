import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 8
 *
 * Test class for Location enumeration.
 *
 * @author Lynden
 * @version 2019-03-28
 */
public class LocationTest {
	
	//	BALLROOM, BILLIARD_ROOM, CONSERVATORY, DINING_ROOM, HALL, KITCHEN, LIBRARY, LOUNGE, STUDY;
	
	/**
	 * Tests the values of the location enumeration
	 */
	@Test
	public void testLocation()
	{
		Assert.assertEquals("Location enum values incorrect", Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location enum values incorrect", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
		Assert.assertEquals("Location enum values incorrect", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location enum values incorrect", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location enum values incorrect", Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Location enum values incorrect", Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location enum values incorrect", Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location enum values incorrect", Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Location enum values incorrect", Location.STUDY, Location.valueOf("STUDY"));


	}

}
