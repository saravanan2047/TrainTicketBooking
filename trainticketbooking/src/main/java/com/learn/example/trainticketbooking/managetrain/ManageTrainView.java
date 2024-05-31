package com.learn.example.trainticketbooking.managetrain;

import java.util.List;
import java.util.Scanner;

import com.learn.example.trainticketbooking.login.LoginView;
import com.learn.example.trainticketbooking.model.Ticket;
import com.learn.example.trainticketbooking.model.Train;
import com.learn.example.trainticketbooking.ticketbooking.ManageTicketView;

public class ManageTrainView {
	private ManageTrainModel trainModel;
	static Scanner scan=  new Scanner(System.in);
	public ManageTrainView()
	{
		trainModel= new ManageTrainModel(this);
	}

	public void init() 
	{
		System.out.println("Manage the Trains Here : ");
		
		while(true) {
		System.out.println("Select option to carry out : \n1) Add train \n2) Display Train \n3) Search Train \n4) Delete Train \n5) Ticket Details \n6) LogOut \n7) Exit  ");
		String choice=scan.next();
		switch(choice)
		{
		case "1":addTrains();
		break;
		case"2":displayTrains();
		break;
		case "3":searchTrains();
		break;
		case"4":deleteTrains(); 
		break;
		case "5":ticketDetails();
		break;
		case "6":logout();
		break;
		case"7": System.out.println("\n... ~~~ Thank You For Useing IRTC App ~~~...\n");
		break;
		default:System.out.println("\nEnter a valid option...!!\n");
		}
		if(choice.equals("7"))
		{
			break;
		}
	}

}
	private void ticketDetails() {
		List<Ticket> tlist=trainModel.getTicketDetails();
	}
	

	public void addTrains() {
		System.out.println("Enter Trains Departure Station : ");
		String departure=scan.next();
		System.out.println("Enter Trains Arrival Station: ");
		String arrival=scan.next();
		System.out.println("Enter Train ID : ");
		String id=scan.next();
		System.out.println("Enter the Train Name : ");
		String tName=scan.next();
		System.out.println("Enter Trains ticket fare : ");
		double fare=scan.nextDouble();
		System.out.println("Enter Trains departure Date :(Eg: 15/02/2024) ");
		String date=scan.next();
		System.out.println("Enter the Number of tickets : ");
		int num=scan.nextInt();
		System.out.println("Enter the Departure time: ");
		String dTime=scan.next();
		System.out.println("Enter the Arrival Time : ");
		String aTime=scan.next();

		Train t= new Train(departure, arrival, id, tName,date, fare,num,dTime,aTime);
		trainModel.addTrain(t);
		System.out.println("\nTrain's Detail Added Successfully....\n");
		
	}
	public  void displayTrains() {
		List<Train> tList= trainModel.getAllTrain();
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
			System.out.println("\nNo Train Found...!!!\nAdd trains first..\n");
		}
		
	}
	public void searchTrains() {
		System.out.println("Enter the Departure Station name : ");
		String dep=scan.next();
		System.out.println("Enter the Arrival Station name : ");
		String arr=scan.next();
		System.out.println("Enter the journey Date : ");
		String date=scan.next();
		
		Train t=trainModel.getTrain(dep,arr,date);
		if(t!=null)
		{
			System.out.println("\nFrom your Search....\n");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%10s %15s %20s %25s %25s","TrainID","Train Departure Station","Train Arrival Station","Departure Date","Ticket Fare\n");
			System.out.println("------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			System.out.format("%10s %15s %20s %25s %25s",t.getTrainID(),t.getDeparture(),t.getArrival(),t.getDate(),t.getFare());
			System.out.println();
		}
		else
		{
			System.out.println("!!! Train not Found...!!!!\nEnter Correct Details..");
		}
		
	}


	private void deleteTrains() 
	{
		System.out.println("Enter the Train number : ");
		String id=scan.next();
		trainModel.deleteTrain(id);		
	}

	private void logout() {
		new LoginView().init();
	}

	public void showAlert(String string) {
		System.out.println(string);
		init();
		
	}

	
}
