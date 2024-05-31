package com.learn.example.trainticketbooking.managetrain;

import java.util.List;

import com.learn.example.trainticketbooking.database.DataBaseTrain;
import com.learn.example.trainticketbooking.model.Ticket;
import com.learn.example.trainticketbooking.model.Train;

public class ManageTrainModel 
{
	private ManageTrainView trainView;
	
	public ManageTrainModel(ManageTrainView trainview)
	{
		this.trainView= trainview;
	}

	public void addTrain(Train t) {
		DataBaseTrain.getInstance().addTrain(t);		
	}

	public List<Train> getAllTrain() {
		return DataBaseTrain.getInstance().getAllTrain();		
	}

	public Train getTrain(String dep, String arr, String date) {
		List<Train> tl= DataBaseTrain.getInstance().getAllTrain();
		for(Train t:tl)
		{
			if(t.getArrival().equals(arr) && t.getDate().equals(date) && t.getDeparture().equals(dep))
			{
				return t;
			}
		}
		return null;
		
	}

	public void deleteTrain(String id) {
		if(DataBaseTrain.getInstance().deleteTrain(id))
			trainView.showAlert("\nTrain Deleted Successfully...\n");
		else
			trainView.showAlert("\nEnter Correct Train ID....!!!!\n");
		
	}
	public List<Ticket> getTicketDetails() {
		return DataBaseTrain.getInstance().getAllTicket();
	}
}
