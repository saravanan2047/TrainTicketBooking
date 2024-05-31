package com.learn.example.trainticketbooking.database;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.learn.example.trainticketbooking.model.Ticket;
//import com.learn.example.trainticketbooking.managetrain.ManageTrainView;
import com.learn.example.trainticketbooking.model.Train;

public class DataBaseTrain 
{
	private static DataBaseTrain trainDb;
	private static List<Train> trainList= new ArrayList<>();
	private static List<Ticket> ticketList=new ArrayList<>();
	private static String trainFile = "train.json";
	private String ticketFile="ticket.jason";
	
	DataBaseTrain(){}
	
	public static DataBaseTrain getInstance()
	{
		if(trainDb==null)
		{
			trainDb= new DataBaseTrain();
		}
		return trainDb;
	}
	
	
	public static void addTrain(Train t)
	{
		trainList.add(t);
	}

	public List<Train> getAllTrain() {
		return trainList;
	}
	
	public boolean  deleteTrain(String id)
	{
		for(Train t:trainList)
		{
			if(t.getTrainID().equals(id))
			{
				trainList.remove(t);
				return true;
			}
		}
		return false;
	}
	public static void addTicket(Ticket ticket)
	{
		ticketList.add(ticket);
	}
	public List<Ticket> getAllTicket()
	{
		return ticketList;
	}
}






















//try {
//File file = new File(trainFile);
//if (!file.exists()) {
//	file.createNewFile();
//}
//ObjectMapper trainObj = new ObjectMapper();
//trainObj.enable(SerializationFeature.INDENT_OUTPUT);
//trainObj.writeValue(file,t);
//} catch (Exception e) {
//new ManageTrainView().showAlert("Error Occured in adding Train");
//}
