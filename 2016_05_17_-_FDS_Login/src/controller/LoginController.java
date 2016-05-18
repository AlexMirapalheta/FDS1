package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{
	
	@FXML
	private TextField txtFieldUser;
	
	@FXML
	private TextField txtFieldPassword;
	
	@FXML
	private Button btnSend;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

	@FXML
	private void teste() {
		// TODO Auto-generated method stub
		btnSend.setOnAction(e -> login(txtFieldUser.getText()));
	}


	private void login(String user) {
		// TODO Auto-generated method stub
		System.out.println("Usuário: "+user+".\n");
	}

}
