package com.learn.example.trainticketbooking.login;

import java.util.Scanner;

import com.learn.example.trainticketbooking.TrainBookingSystem;
import com.learn.example.trainticketbooking.managetrain.ManageTrainView;
import com.learn.example.trainticketbooking.ticketbooking.ManageTicketView;

public class LoginView {
	Scanner scanner = new Scanner(System.in);
	private static LoginModel loginmodel;
	static Scanner scan = new Scanner(System.in);

	public LoginView() {
		loginmodel = new LoginModel(this);
	}

	public void initCreation() {
		System.out.println("-------------------" + TrainBookingSystem.getInstance().getAppName()
				+ " -------------------- \n\t\t   Version: " + TrainBookingSystem.getInstance().getVersion() + "\n");
		init();
	}

	public void init() {
		System.out.println("****************** WELCOME To Train Booking System ****************");
		System.out.println("\n************* Please Login To Proceed ************");

		System.out.println("1) Admin \n2) User");
		String choice = scan.next();
		login(choice);

	}

	private void login(String choice) {
		switch (choice) {
		case "1":
			adminLogin();
			break;
		case "2":
			userLogin();
			break;
		default:
			System.out.println("\nEnter a valid Input...!!!!\n");
			init();
		}
	}

	private void adminLogin() {
		System.out.println("\nEnter the user name:");
		String userName = scanner.next();
		System.out.println("Enter the password:");
		String password = scanner.next();
		loginmodel.validateUser(userName, password);

	}

	private void userLogin() {
		new ManageTicketView().init();
	}

	public void onSuccess() {
		System.out.println("\n\n**************** Login successful *****************\n\n --------- Welcome To IRTC "
				+ TrainBookingSystem.getInstance().getAppName() + " ---------\n  " + "\n\t\t ----- V"
				+ TrainBookingSystem.getInstance().getVersion() + "----\n  ");

		new ManageTrainView().init(); // calling the next package method
	}

	public void showAlert(String message) {
		System.out.println(message);
		checkForLogin();
	}

	private void checkForLogin() {
		System.out.println("Do you try again? Type\n \n1) Yes\n2) No");

		String choice = scanner.next();
		if (choice.equalsIgnoreCase("1")) {
			init();
		} else if (choice.equalsIgnoreCase("2")) {
			System.out.println("\n <------------> Thanks You <------------>");
		} else {
			System.out.println("\nInvalid choice, Please enter valid choice.\n");
			checkForLogin();
		}
	}
}
