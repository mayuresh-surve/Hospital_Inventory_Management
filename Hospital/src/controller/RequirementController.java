package controller;

import java.sql.SQLException;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Requirement;
import model.RequirementDAO;

public class RequirementController {

    @FXML
    private Label lblWardName;

    @FXML
    private Label lblProductName1;

    @FXML
    private Label lblQuantity1;

    @FXML
    private Label lblRequirement;

    @FXML
    private TextField txtWardName;

    @FXML
    private TextField txtProductName1;

    @FXML
    private TextField txtQuantity1;

    @FXML
    private TableView<Requirement> tbView1;

    @FXML
    private TableColumn<Requirement, Integer> tbcSrNo;

    @FXML
    private TableColumn<Requirement, String> tbcWardName;

    @FXML
    private TableColumn<Requirement, String> tbcProductName;

    @FXML
    private TableColumn<Requirement, Integer> tbcQuantity;

    @FXML
    private Button btnUpdate1;

    @FXML
    private Button btnDelete1;

    @FXML
    private Label lblSrNo;

    @FXML
    private TextField txtSrNo;
    
    @FXML
    private void insertIntoRequirement(ActionEvent event) throws ClassNotFoundException, SQLException
    {
    	RequirementDAO.insertIntoRequirement(txtSrNo.getText(), txtWardName.getText(), txtProductName1.getText(), txtQuantity1.getText());
    	ObservableList<Requirement> req = RequirementDAO.getAllRecords();
		populateTable(req);
    }
    
    @FXML
    private void initialize() throws Exception	
    {
    	tbcSrNo.setCellValueFactory(cellData -> cellData.getValue().getSerialNo().asObject());
    	tbcWardName.setCellValueFactory(cellData -> cellData.getValue().getWardName());
		tbcProductName.setCellValueFactory(cellData -> cellData.getValue().getProductname());
		tbcQuantity.setCellValueFactory(cellData -> cellData.getValue().getQuantity().asObject());
		ObservableList<Requirement> req = RequirementDAO.getAllRecords();
		populateTable(req);
    }
    
    private void populateTable(ObservableList<Requirement> req)
	{
		tbView1.setItems(req);
	}

}
