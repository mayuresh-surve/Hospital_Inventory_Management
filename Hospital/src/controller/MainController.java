package controller;

import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;

public class MainController
{
	@FXML 
	private Labeled lblStatus;
	
	@FXML 
	private TextField txtUsername;
	
	@FXML 
	private PasswordField txtPassword;
	
    @FXML
    private Labeled lblUser;

    @FXML
    private Labeled lblPass;

    @FXML
    private ImageView imgLogo;
    
    @FXML
    private Button btnInventory;

    @FXML
    private Button btnRequirement;

    @FXML
    private Button btnVender;

    @FXML
    private Labeled lblstmt;
	
	@FXML
	public void Login(ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		if(txtUsername.getText().equals("mayuresh")  && txtPassword.getText().equals("browndynamite"))
		{
			lblStatus.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root,400,150);
			primaryStage.setTitle("Main Window");
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		else if(txtUsername.getText().equals("shubham")  && txtPassword.getText().equals("weird"))
		{
			lblStatus.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root,400,150);
			primaryStage.setTitle("Main Window");
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else if(txtUsername.getText().equals("dhiraj")  && txtPassword.getText().equals("flame"))
		{
			lblStatus.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root,400,150);
			primaryStage.setTitle("Main Window");
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else if(txtUsername.getText().equals("calvin")  && txtPassword.getText().equals("sharpened"))
		{
			lblStatus.setText("Login Success");
			Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			Scene scene = new Scene(root,400,150);
			primaryStage.setTitle("Main Window");
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else
		{
			lblStatus.setText("Login Failed!!!");
		}
	}
	
	@FXML
	public void Inventory(ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/controller/Inventory.fxml"));
		Scene scene = new Scene(root,700,500);
		primaryStage.setTitle("Inventory");
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void Requirement(ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/controller/Requirement.fxml"));
		Scene scene = new Scene(root,715,500);
		primaryStage.setTitle("Requirement");
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@FXML
	public void Vendor(ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/controller/vender.fxml"));
		Scene scene = new Scene(root,750,600);
		primaryStage.setTitle("Vendor");
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
