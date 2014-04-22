package server.controller.test;

import org.junit.Test;

import client.parkingdisplay.PantherLotSpotDriver;
import client.security.PantherLotSecurityDriver;
import junit.framework.TestCase;
import server.controller.AccessControlServer;
import server.controller.EntranceDisplayController;

/**
 * The class <code>AccessControlServerTest</code> contains tests for the class
 * {@link <code>AccessControlServer</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 2/24/14 11:09 PM
 *
 * @author Adrian
 *
 * @version $Revision$
 */
public class AccessControlServerTest extends TestCase {
	AccessControlMainDriver acm;
	PantherLotSecurityDriver sec;
	PantherLotSpotDriver spot;
	
	protected void setUp() throws Exception {
		super.setUp();
		acm = new AccessControlMainDriver();
		sec = new PantherLotSecurityDriver();
		spot = new PantherLotSpotDriver();
		
	}
	
	@Test
	public void testIsConnectionAvailable(){
		acm.start();
		sec.start();
		spot.start();
		

		EntranceDisplayController eDisp = new EntranceDisplayController();
		eDisp.runDisplays();
		
		//This test should find the given connection, so it should return true
		assertTrue("312 is valid connection but isConnectionAvailable does not return True!", acm.server.isConnectionAvailable("312"));
		
		//This test should not find the given connection, and return false
		
		
		
	}
	
	
	protected void tearDown() throws Exception {
		super.tearDown();
		acm = null;
		sec = null;
		spot = null;
	}
}