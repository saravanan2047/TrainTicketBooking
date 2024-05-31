package com.learn.example.trainticketbooking.login;

public class LoginModel 
{
	private LoginView loginView;
	public LoginModel(LoginView loginview)
	{
		this.loginView=loginview;
	}
	public void validateUser(String userName, String password) {
		if (isValidUserName(userName)) {
			if (isValidPassword(password)) {
				loginView.onSuccess();
			} else {
				loginView.showAlert("Invalid Password");
			}

		} else {
			loginView.showAlert("Invalid UserName \nEnter the Credential Again.");
		}

	}

	private boolean isValidUserName(String name) {
		return name.equals("Admin");
	}

	private boolean isValidPassword(String password) {
		return password.equals("123");
	}
	
}
