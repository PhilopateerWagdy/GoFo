package Project;

import java.util.Scanner;

/**
 * this is owner class
 * @author googel plus
 * @version 4.4.2
 *
 */
public class Owner extends User {

	private Integer Phone;
	private String Address;
	private eWallet ew;
	private Playground pg;

	/**
	 * enables owner to create his own profile
	 * @param phone is the phone number
	 * @param address is the address of owner
	 */
	public void createProfile(Integer phone, String address) {		
		setPhone(phone);
		setAddress(address);
	}

	/**
	 * enables user to add a new playground
	 * @param location is the playground's location
	 * @param size is the size of the playground
	 * @param price is the price of playground per hour
	 */
	public void addPlayground(String location, int size, int price) {
		Playground Pg = new Playground();
		Pg.setLocation(location);
		Pg.setSize(size);
		Pg.setPricePerHour(price);
		
		Administrator admin = new Administrator();
		if(admin.approvePlayground(Pg)==true)
		{
			system.pg.add(Pg);
			System.out.println("added successfully");
		}
		else
		{
			admin.suspendPlayground();
		}
		
	}

	/**
	 * enable owner to update playground info
	 * @param obj is the playground to be updated
	 * @return obj
	 */
	public Playground updatePlayground(Playground obj) {
		return obj;
		// TODO - implement Owner.updatePlayground
	}

	/**
	 * enables owner to view all bookings of a playground
	 * @param obj playground to be viewed
	 */
	public void viewBooking(Playground obj) {
		// TODO - implement Owner.viewBooking
	}

	/**
	 * enables owner to check his own e wallet
	 * @param obj is the owner's e wallet
	 * @return false
	 */
	public boolean checkWallet(eWallet obj) {
		return false;
		// TODO - implement Owner.checkWallet
	}

	/**
	 * set phone number of the owner
	 * @param phone is the phone number entered by owner
	 */
	public void setPhone(Integer phone) {
		Phone=phone;
	}

	/**
	 * print out  phone number
	 * @return phone number
	 */
	public Integer getPhone() {
		return Phone;
		// TODO - implement Owner.getPhone
	}

	/**
	 * set address of the owner
	 * @param address is the address entered by owner
	 */
	public void setAddress(String address) {
		Address=address;
	}

	
	/**
	 * get address of the owner
	 * @return address
	 */
	public String getAddress() {
		return Address;
		
	}


	public Owner() {
		Phone=01000000000;
		Address=" ";
	}

}