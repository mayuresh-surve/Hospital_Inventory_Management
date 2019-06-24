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
import model.Vendor;
import model.VendorDAO;

public class VendorController {

    @FXML
    private Label lblVender;

    @FXML
    private TableView<Vendor> tbView2;
    
    @FXML
    private TableColumn<Vendor, String> tbcvendorname;

    @FXML
    private TableColumn<Vendor, Integer> tbcphoneno;

    @FXML
    private TableColumn<Vendor, String> tbcaddress;

    @FXML
    private TableColumn<Vendor, String> tbcproductname;

    @FXML
    private TableColumn<Vendor, Integer> tbcquantity;

    @FXML
    private TableColumn<Vendor, Integer> tbcamount;

    @FXML
    private TextField txtVendorName;

    @FXML
    private TextField txtPhoneNo;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtProductName2;

    @FXML
    private TextField txtQuantity2;

    @FXML
    private TextField txtAmount;

    @FXML
    private Label lblVendorName;

    @FXML
    private Label lblPhoneNo;

    @FXML
    private Label lblAddress;

    @FXML
    private Label lblProductName2;

    @FXML
    private Label lblQuantity2;

    @FXML
    private Label lblAmount;

    @FXML
    private Button btnUpdate2;

    @FXML
    private Button btnDelete2;
    
    @FXML
    private void insertIntoVendor(ActionEvent event) throws ClassNotFoundException, SQLException
    {
    	VendorDAO.insertIntoVendor(txtVendorName.getText(), txtPhoneNo.getText(), txtAddress.getText(), txtProductName2.getText(),txtQuantity2.getText(),txtAmount.getText());
    	ObservableList<Vendor> ven = VendorDAO.getAllRecords();
		populateTable(ven);
    }
    
    @FXML
    private void initialize() throws Exception	
    {
    	tbcvendorname.setCellValueFactory(cellData -> cellData.getValue().getVenderName());
    	tbcphoneno.setCellValueFactory(cellData -> cellData.getValue().getPhoneNo().asObject());
		tbcaddress.setCellValueFactory(cellData -> cellData.getValue().getAddress());
		tbcproductname.setCellValueFactory(cellData -> cellData.getValue().getProductName());
		tbcquantity.setCellValueFactory(cellData -> cellData.getValue().getQuantity().asObject());
		tbcamount.setCellValueFactory(cellData -> cellData.getValue().getAmount().asObject());
		ObservableList<Vendor> ven = VendorDAO.getAllRecords();
		populateTable(ven);
    }
    
    private void populateTable(ObservableList<Vendor> ven)
	{
		tbView2.setItems(ven);
	}

}

