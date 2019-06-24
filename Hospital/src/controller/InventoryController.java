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
import model.Inventory;
import model.InventoryDAO;

public class InventoryController {

    @FXML
    private Label lblProductNo;

    @FXML
    private Label lblProductName;

    @FXML
    private Label lblQuantity;

    @FXML
    private Label lblInventory;

    @FXML
    private TextField txtProductNo;

    @FXML
    private TextField txtProductName;

    @FXML
    private TextField txtQuantity;

    @FXML
    private TableView<Inventory> tbView;

    @FXML
    private TableColumn<Inventory, Integer> tbcProductNo;

    @FXML
    private TableColumn<Inventory, String> tbcProductName;

    @FXML
    private TableColumn<Inventory, Integer> tbcQuantity;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;
    
    @FXML
    private void insertIntoInventory(ActionEvent event) throws ClassNotFoundException, SQLException
    {
    	InventoryDAO.insertIntoInventory(txtProductNo.getText(), txtProductName.getText(), txtQuantity.getText());
    	ObservableList<Inventory> inv = InventoryDAO.getAllRecords();
		populateTable(inv);
    }
    
    @FXML
    private void initialize() throws Exception	
    {
    	tbcProductNo.setCellValueFactory(cellData -> cellData.getValue().getProductNo().asObject());
		tbcProductName.setCellValueFactory(cellData -> cellData.getValue().getProductName());
		tbcQuantity.setCellValueFactory(cellData -> cellData.getValue().getQuantity().asObject());
		ObservableList<Inventory> inv = InventoryDAO.getAllRecords();
		populateTable(inv);
    }

	private void populateTable(ObservableList<Inventory> inv)
	{
		tbView.setItems(inv);
	}
}

