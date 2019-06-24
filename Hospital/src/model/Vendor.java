package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vendor 
{
	private StringProperty vendornameProperty;
	private IntegerProperty phonenoProperty;
	private StringProperty addressProperty;
	private StringProperty productnameProperty;
	private IntegerProperty quantityProperty;
	private IntegerProperty amountProperty;
	
	Vendor()
	{
		this.vendornameProperty = new SimpleStringProperty();
		this.phonenoProperty = new SimpleIntegerProperty();
		this.addressProperty = new SimpleStringProperty();
		this.productnameProperty = new SimpleStringProperty();
		this.quantityProperty = new SimpleIntegerProperty();
		this.amountProperty = new SimpleIntegerProperty();
	}
	//This is for Vendor Name
	public String getVenName() {
		return vendornameProperty.get();
	}
	public void setVenName(String vender) {
		this.vendornameProperty.set(vender);
	}
	public StringProperty getVenderName() {
		return vendornameProperty;
	}
	//This is for Phone no
	public int getPhNo() {
		return phonenoProperty.get();
	}
	public void setPhNo(int phone) {
		this.phonenoProperty.set(phone);
	}
	public IntegerProperty getPhoneNo() {
		return phonenoProperty;
	}
	//This is for address
	public String getAdd() {
		return addressProperty.get();
	}
	public void setAdd(String address) {
		this.addressProperty.set(address);
	}
	public StringProperty getAddress() {
		return addressProperty;
	}
	//This is for product name
	public String getPName() {
		return productnameProperty.get();
	}
	public void setPName(String product) {
		this.productnameProperty.set(product);
	}
	public StringProperty getProductName() {
		return productnameProperty;
	}
	//This is for quantity
	public int getQun() {
		return quantityProperty.get();
	}
	public void setQun(int quantity) {
		this.quantityProperty.set(quantity);
	}
	public IntegerProperty getQuantity() {
		return quantityProperty;
	}
	//This is for amount
	public int getAmt() {
		return amountProperty.get();
	}
	public void setAmt(int amount) {
		this.amountProperty.set(amount);
	}
	public IntegerProperty getAmount() {
		return amountProperty;
	}
}
