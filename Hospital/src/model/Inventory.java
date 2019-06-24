package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Inventory
{
	private IntegerProperty productnoProperty;
	private StringProperty productnameProperty;
	private IntegerProperty quantityProperty;
	
	public Inventory()
	{
		this.productnoProperty = new SimpleIntegerProperty();
		this.productnameProperty = new SimpleStringProperty();
		this.quantityProperty = new SimpleIntegerProperty();
	}
	//This is for product No
	public int getPrdNo() {
		return productnoProperty.get();
	}
	public void setPrdNo(int No) {
		this.productnoProperty.set(No);
	}
	public IntegerProperty getProductNo() {
		return productnoProperty;	
	}
	//This is for product name
	public String getPrdName() {
		return productnameProperty.get();
	}
	public void setPrdName(String name) {
		this.productnameProperty.set(name);
	}
	public StringProperty getProductName() {
		return productnameProperty;	
	}
	//This is for Quantity
	public int getQun() {
		return quantityProperty.get();
	}
	public void setQun(int qun) {
		this.quantityProperty.set(qun);
	}
	public IntegerProperty getQuantity() {
		return quantityProperty;	
	}
}
