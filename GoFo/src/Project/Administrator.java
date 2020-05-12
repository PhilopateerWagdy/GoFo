package Project;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * this is administrator class
 * @author googel plus
 * @version 4.4.2
 */
public class Administrator extends User {

	/**
	 * make the admin confirm a playground
	 * @param pg is the playground to be approved
	 * @return bool
	 */
	public boolean approvePlayground(Playground pg) 
	{
		if( pg.getLocation()!= null  && pg.getPricePerHour()!= 0 && pg.getSize()!= 0  )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 *  make the admin cancel a playground
	 */
	public void suspendPlayground() {
		System.out.println("playground is suspended");
	}

	/**
	 * enables admin to delete a playground
	 * @param Playgrounds is the playground to be deleted
	 * @return null
	 */
	public Playground deletePlayground(ArrayList<Playground> Playgrounds) {
		return null;
		// TODO - implement Administrator.deletePlayground
	}

	/**
	 * make playground is available to players to be booked
	 * @param pg is the playground to be available
	 * @return pg
	 */
	public Playground activatePlayground(Playground pg) {
		return pg;
		// TODO - implement Administrator.activatePlayground
	}

	public Administrator() {
		// TODO - implement Administrator.Administrator
	}

}