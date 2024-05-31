package com.learn.example.trainticketbooking.ticketbooking;

import java.util.List;

import com.learn.example.trainticketbooking.database.DataBaseTrain;
import com.learn.example.trainticketbooking.model.Ticket;
import com.learn.example.trainticketbooking.model.Train;

public class ManageTicketModel {
	private ManageTicketView ticketView;
	
	public ManageTicketModel(ManageTicketView ticketview)
	{
		this.ticketView=ticketview;
	}
	public void init() {
		System.out.println("Hello");
		
	}
	public List<Train> getAllTrain() {
		return DataBaseTrain.getInstance().getAllTrain();		
	}
	public void addTicket(Ticket ticket) {
		 DataBaseTrain.getInstance().addTicket(ticket);
		
	}

}
