package com.learn.example.trainticketbooking;

import com.learn.example.trainticketbooking.login.LoginView;

public class TrainBookingSystem {

	private static TrainBookingSystem trainticket;
	private String appName = "TRAIN BOOKING SYSTEM";
	private String version = "1.0.0";

	public TrainBookingSystem() {

	}

	public static TrainBookingSystem getInstance() {
		if (trainticket == null) {
			trainticket = new TrainBookingSystem();
		}
		return trainticket;
	}

	public void create() {
		LoginView loginview = new LoginView();
		loginview.initCreation();
	}

	public String getAppName() {
		return trainticket.appName;
	}

	public String getVersion() {
		return trainticket.version;
	}

	public static void main(String[] args) {
		TrainBookingSystem.getInstance().create();

	}
}
