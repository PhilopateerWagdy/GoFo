package Project;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer; 
import java.util.TimerTask;


class timer extends Thread{
public void run(){
    for(int i=1800;i>=0;i--){ //1800 seconds = 30 minutes
        System.out.print(i+" ");
        try {
            Thread.sleep(1800);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(i==0)
        {
        	boolean activated = false;
        	System.out.println("your verification is expired try again later");
        }
    }
}
}
/**
 * this is system class
 * @author googel plus
 * @version 4.4.2
 * 
 */

public class system {

	
	static ArrayList<Player> P = new ArrayList<Player>();
	static ArrayList<Owner> O = new ArrayList<Owner>();
	static ArrayList<Playground> pg = new ArrayList<Playground>();
	private String Notification;
	private eWallet ew;

	/**
	 * print out that there is an error
	 */
	public void fixError() {
		// TODO - implement System.fixError
	}

	/**
	 * get email address and verify if it is correct or wrong
	 * @return bool
	 */
	public static boolean verifyEmail() {
		timer t=new timer();
		t.start();
		boolean activated=false;
		System.out.println("Please enter code");
		while (t.isAlive()) {
			Scanner input = new Scanner(System.in);
		    String code=input.next();
		    activated=true;
			if(!t.isAlive())
			{
				activated=false;
				break;
			}
		    
		    if(activated==true){
		        System.out.println("Your email is activated");
		        
		        t.stop();
		        break;
		    }   
		        
		}
		return activated;
		
	}
	
	/**
	 * enable the owner to add his playground to the system to be rented by players
	 * @param obj is the playground to be added
	 */
	public void AddPlayground(Playground obj)
	{
		pg.add(obj);
	}
	
	/**
	 * send confirmation message for an email
	 */
	public void confirmEmail() {
		// TODO - implement System.confirmEmail
	}

	/**
	 * cancel creating an email
	 */
	public void cancel() {
		// TODO - implement System.cancel
	}

	/**
	 * display all hours for each playground
	 */
	public void playingHours() {
		// TODO - implement System.playingHours
	}

	/**
	 * Allow owner to create new playground
	 */
	public void openPlayground() {
		// TODO - implement System.openPlayground
	}

	/**
	 * 
	 * @param location is the location of playground
	 * @param size is the size of playground
	 * @param price is the price of playground per hour
	 */
	public void sendPlaygroundInfo(String location, String size, Integer price) {
		// TODO - implement System.sendPlaygroundInfo
	}

	/**
	 * make a request to administrator to add new playground
	 */
	public void playgroundRequest() {
		// TODO - implement System.playgroundRequest
	}

	/**
	 * display menu to player
	 */
	public void view() {
		// TODO - implement System.view
	}

	/**
	 * confirm that a player booked a time slot
	 */
	public void confirmBooking() {
		// TODO - implement System.confirmBooking
	}

	/**
	 * calculates total payment for the player
	 * @param noOfHours is the number of hours that the player wants to reserve
	 * @return number of hours
	 */
	public Integer calculateTotal(Integer noOfHours) {
		return noOfHours;
		// TODO - implement System.calculateTotal
	}

	/**
	 * sends all information about user to initiate new user
	 * @param id is the id of user
	 * @param name is the name of user
	 * @param password is the user's password
	 * @param email is the user's email
	 */
	public void send(Integer id, String name, String password, String email) {
		// TODO - implement System.send
	}
	
	
}