package client.security;

public class PantherLotSecurityDriver extends Thread {
	public void run(){
		SecurityDisplay security = new SecurityDisplay("localhost", 3738);
	}
	
	public void exit(){
		System.exit(0);
	}
}
