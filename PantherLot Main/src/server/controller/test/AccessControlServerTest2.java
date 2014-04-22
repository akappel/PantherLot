package server.controller.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import client.parkingdisplay.PantherLotSpotDriver;
import server.controller.AccessControlServer;
import server.controller.EntranceDisplayController;

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
		assertFalse(acs.isConnectionAvailable("999")); //spot number not in database
		assertTrue(acs.isConnectionAvailable("312")); //spot number is in database
	}

}
