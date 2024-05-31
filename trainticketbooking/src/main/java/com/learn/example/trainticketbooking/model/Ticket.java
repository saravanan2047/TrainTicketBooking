package com.learn.example.trainticketbooking.model;

public class Ticket 
{
	
	double fare;
	String trainID;
	String ticketPNR;
	String departure;
	String arrival;
	String passengerName;
	int numberOfPassengers;
	String ticketStatus;

	
	public Ticket() {}
	
	public Ticket(String passengerName, double fare, String departure, String arrival, int numberOfPassengers,
			String trainID,String ticketPNR,String ticketStatus) {
		super();
		this.passengerName = passengerName;
		this.fare = fare;
		this.departure = departure;
		this.arrival = arrival;
		this.numberOfPassengers = numberOfPassengers;
		this.trainID = trainID;
		this.ticketPNR=ticketPNR;
		this.ticketStatus=ticketStatus;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public String getTrainID() {
		return trainID;
	}
	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}
	public void setTicketPNR(String ticketPNR) {
		this.ticketPNR = ticketPNR;
	}
	public String getTicketPNR() {
		return ticketPNR;
	}
	
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus=ticketStatus;
	}
	

}
