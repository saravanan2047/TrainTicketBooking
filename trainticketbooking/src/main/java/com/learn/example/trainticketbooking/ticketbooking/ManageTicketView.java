package com.learn.example.trainticketbooking.ticketbooking;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.learn.example.trainticketbooking.TrainBookingSystem;
import com.learn.example.trainticketbooking.model.Ticket;
import com.learn.example.trainticketbooking.model.Train;

public class ManageTicketView 
{
	private ManageTicketModel ticketModel;
	static Scanner scan= new Scanner(System.in);
	public ManageTicketView ()
	{
		ticketModel= new ManageTicketModel(this);
	}

	public void init() {
		System.out.println("-------------------" + TrainBookingSystem.getInstance().getAppName()
				+ " -------------------- \n\t\t   Version: " + TrainBookingSystem.getInstance().getVersion() + "\n");
		ticektManage();
	}

	public void ticektManage() {
		while(true) {
			System.out.println("Select the Option to Carry Out..\n1) Book Ticket 2) Cancel Ticekt 3) GET PNR Details 4) Display Trains 5) Exit ");
			String choice=scan.next();
			switch(choice)
			{
			case "1":bookTicket();
			break;
			case"2": cancelTicekts();
			break;
			case "3":TicketDetails();
			break;
			case"4":displayTrains();
			break;
			case"5": System.out.println("\n... ~~~ Thank You For Useing IRTC App ~~~...\n");
			break;
			default:System.out.println("\nEnter a valid option...!!\n");
			}
			if(choice.equals("5"))
			{
				break;
			}
		}
	}
	public void bookTicket() {
		displayTrains();
	
		System.out.println("\n\nEnter Train Id :");
		String tId=scan.next();
		Train t=found(tId);
		if(t!=null)
		{
			System.out.println("Enter Your NAME : ");
			String name=scan.next();
			System.out.println("Enter Number of Passengers : ");
			int numPass=scan.nextInt();
			if(t.getNoOfTickets()!=0)
			{
				String status="Confirmed";
				String pnr=generatePNR();
				Ticket ticket= new Ticket(name,t.getFare()*numPass,t.getDeparture(),t.getArrival(),numPass,t.getTrainID(),pnr,status);
				t.setNoOfTickets(t.getNoOfTickets()-numPass);
				ticketModel.addTicket(ticket);
			}			
		}
		else
			
		{
			System.out.println("The Train Your are Seraching not Found ...\nTry With Another Train.");
		}	
	}

	private String generatePNR() {
		Random rand= new Random();
		String pnr="";
		for(int i=0;i<10;i++)
		{
			pnr+=rand.nextInt(100);
			pnr+=(char)rand.nextInt(27)+65;
		}
		return pnr;
	}

	private Train found(String tId) {
		List<Train> tList= ticketModel.getAllTrain();
		for(Train t:tList)
		{
			if(t.getTrainID().equals(tId)) return t;
		}
		return null;
	}

	public void displayTrains() 
	{
		List<Train> tList= ticketModel.getAllTrain();
		if(tList!=null) {
		System.out.println("The Details of the Trains are : ");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s %15s %20s %25s %25s","TrainID"," Departure Station"," Arrival Station","Departure Date","Ticket Fare");
		System.out.println();
		for(Train t:tList)
		{
			System.out.println("---------------------------------------------------------------------------------------------------------------");		
			System.out.format("%10s %15s %20s %25s %25s",t.getTrainID(),t.getDeparture(),t.getArrival(),t.getDate(),t.getFare()+"\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------");
//			System.out.println();
		}
		}
		else
		{
			System.out.println("\nNo Train Found...!!!\n");
		}
		
		
	}

	public void TicketDetails() {
		// TODO Auto-generated method stub
		
	}

	public void cancelTicekts() {
		// TODO Auto-generated method stub
		
	}

	

}
