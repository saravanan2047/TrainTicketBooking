package com.learn.example.trainticketbooking.model;

public class Train 
{
	String departure;
	String arrival;
	String trainID;
	String date;
	double fare;
	int noOfTickets;
	String trainName;
	String departureTime;
	String ArrivalTime;
	
	
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
	public String getTrainID() {
		return trainID;
	}
	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public Train(String departure, String arrival, String trainID, String trainName,String date, double fare, int noOfTickets,
			 String departureTime, String arrivalTime) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.trainID = trainID;
		this.date = date;
		this.fare = fare;
		this.noOfTickets = noOfTickets;
		this.trainName = trainName;
		this.departureTime = departureTime;
		ArrivalTime = arrivalTime;
	}
	
	

}
