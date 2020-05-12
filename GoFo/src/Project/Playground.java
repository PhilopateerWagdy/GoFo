package Project;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * this is playground class
 * @author googel plus
 * @version 4.4.2
 */
public class Playground {

	private static final ArrayList<Playground> Playgrounds = null;
	private String Name;
	private String description;
	private String Location;
	private Integer BookingNumber;
	private float PricePerHour;
	private int Size;
	private String availability;
	private Integer cancellationPeriod;
	private int[] slots;

	/**
	 * print all information about playground
	 */
	public void print() {
		// TODO - implement Playground.print
	}

	/**
	 * set name of playground
	 * @param name is the name entered by owner
	 */
	public void setName(String name) {
		this.Name = name;
	}

	/**
	 * get name of the playground
	 * @return playground's name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * set location of the playground
	 * @param location is the location entered by owner
	 */
	public void setLocation(String location) {
		this.Location = location;
	}

	/**
	 * get location of the playground
	 * @return playground's location
	 */
	public String getLocation() {
		return this.Location;
	}

	/**
	 * set number of the booking
	 * @param bookingno is the booking number
	 */
	public void setBookingNo(Integer bookingno) {
		this.BookingNumber = bookingno;
	}

	/**
	 * get booking number
	 * @return booking number
	 */
	public Integer getBookingNo() {
		return BookingNumber;
	}

	/**
	 * set size of playground
	 * @param size is the size entered by owner
	 */
	public void setSize(int size) {
		Size = size;
	}

	/**
	 * get size of the playground
	 * @return size
	 */
	public int getSize() {
		return this.Size;
	}

	/**
	 * set price of playground per hour
	 * @param price is the price of playground per hour
	 */
	public void setPricePerHour(float price) {
		this.PricePerHour = price;
	}

	/**
	 * get price of playground per hour
	 * @return price
	 */
	public float getPricePerHour() {
		return this.PricePerHour;
	}

	/**
	 * cancels a booked time
	 * @param canc to be canceled
	 */
	public void setCancellationPeriod(Integer canc) {
		this.cancellationPeriod = canc;
	}

	/**
	 * get the canceled period
	 * @return canceled period
	 */
	public Integer getCancellationPeriod() {
		return this.cancellationPeriod;
	}

	/**
	 * set the available slots 
	 * @param slot is the slot hour
	 * @param i is the slot number
	 */
	public void setSlots(Integer slot,Integer i) 
	{
			slots[i]=slot;
	}

	/**
	 * print out slots 
	 * @return slots
	 */
	public Integer getSlots() 
	{
		Integer x = null;
		for(int i=0;i<12;i++)
		{
			x = slots[i];
		}
		return x;
	}
	
	/**
	 * print slots
	 * @param i is the slot number
	 * @return slots
	 */
	public Integer getSlots(Integer i) 
	{
		return slots[i];
	}


	/**
	 * enables to verify a field
	 * @return bool
	 */
	public boolean fieldVerification() {
		return false;
		// TODO - implement Playground.fieldVerification
	}

	public Playground() {
		slots = new int[12];
		for(int i=0;i<12;i++)
		{
			slots[i]=0;
		}
	}

}
