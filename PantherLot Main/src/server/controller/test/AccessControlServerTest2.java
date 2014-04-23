package server.controller.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import client.parkingdisplay.PantherLotSpotDriver;
import client.parkingdisplay.SpotDisplay;
import client.security.PantherLotSecurityDriver;

import server.controller.AccessControlServer;
import server.controller.EntranceDisplayController;
import server.storage.*;

public class AccessControlServerTest2 {
	AccessControlServer acs;
	
	@Before
	public void setUp() throws Exception {
		acs = new AccessControlServer(3738);
		
	}

	@Test
	public void testRun() {
		//This test will determine if the thread is successfully started
		assertFalse(acs.isAlive());
		acs.start();
		assertTrue("THREAD WAS NOT STARTED", acs.isAlive());
	}
	
	@Test
	public void testIsConnectionAvailable() throws InterruptedException {
		acs.start();
		
		SpotDisplay spot = new SpotDisplay("localhost", 3738, "312");
		spot.start();
		
		//EntranceDisplayController eDisp = new EntranceDisplayController();
		//eDisp.runDisplays();
		
		ParkedUsers garage = ParkedUsers.instance("garage.txt");
        System.out.println(garage);
		
		assertTrue(acs.isConnectionAvailable("312"));
		
	}
	
	@Test
	public void testReserveSpot() {
		
		
	}

}
