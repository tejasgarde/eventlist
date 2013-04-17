package com.soule.evtm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private Label userEmail ;

	@FXML
	private Label userPassword;
	
	@FXML
	private TextField txtUserEmail;
	
	@FXML
	private PasswordField txtUserPassword;
	
	private MainApp mainApp;
	
	public LoginController(){}
	
	@FXML
	private void initialize() {
		
	}
	@FXML
	public void handleLogin() {
		
		String userEM = txtUserEmail.getText();
		
		String userPW = txtUserPassword.getText();
		if(userEM.equalsIgnoreCase(userPW)){
			mainApp.setUserLoggedIn(true);
			mainApp.loadApplication();
		}
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
	}
}
