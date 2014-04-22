package server.controller.test;

import server.controller.AccessControlServer;
import server.storage.ParkedUsers;
import server.storage.ParkingSpot;

public class AccessControlMainDriver extends Thread {
	public AccessControlServer server;
	
	public void run() {
		server = new AccessControlServer(3738);       
        server.start();
        
        ParkedUsers garage = ParkedUsers.instance("garage.txt");
        
        System.out.println(garage);
        
        //EntranceDisplayController eDisp = new EntranceDisplayController();        
        /*while(true)
        {
            eDisp.runDisplays();
            if(eDisp.getSpot() != null)
            {
                if(eDisp.getCurrentUserID().length() > 2 
                        && !eDisp.getDuplicate())
                    server.reserveSpot(eDisp.getSpot(), 
                            eDisp.getCurrentUserID());
                else
                    server.reserveSpot(eDisp.getSpot(), "no id");
            }
            else if(eDisp.getDuplicate())
            {
                String ID = eDisp.getCurrentUserID();
                ParkingSpot dup = eDisp.getDuplicateParkingSpot(ID);
                System.out.println("sending notification");
                server.duplicateIdFound("User with ID:" + ID + 
                        " has reported an stolen ID.","The car with the same ID"
                        + " is parked on spot #" + dup.getParkingNumber());
            }
        }*/
        
	}
}
