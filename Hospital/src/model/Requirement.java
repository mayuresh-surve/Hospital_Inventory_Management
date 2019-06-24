package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Requirement 
{
	private IntegerProperty srProperty;
	private StringProperty wardProperty;
	private StringProperty productnameProperty;
	private IntegerProperty quantityProperty;
	
	public Requirement()
	{
		this.srProperty = new SimpleIntegerProperty();
		this.wardProperty = new SimpleStringProperty();
		this.productnameProperty = new SimpleStringProperty();
		this.quantityProperty = new SimpleIntegerProperty();
	}
	
	//This is for serial no
	public int getSrNo() {
		return srProperty.get();
	}
	public void setSrNo(int sr) {
		this.srProperty.set(sr);
	}
	public IntegerProperty getSerialNo() {
		return srProperty;
	}
	//This is for ward name
	public String getWname() {
		return wardProperty.get();
	}
	public void setWname(String ward) {
		this.wardProperty.set(ward);
	}
	public StringProperty getWardName() {
		return wardProperty;
	}
	//This is for product name
	public String getPname() {
		return productnameProperty.get();
	}
	public void setPname(String product) {
		this.productnameProperty.set(product);
	}
	public StringProperty getProductname() {
		return productnameProperty;
	}
	//This is for quantity
	public int getquan() {
		return quantityProperty.get();
	}
	public void setquan(int sr) {
		this.quantityProperty.set(sr);
	}
	public IntegerProperty getQuantity() {
		return quantityProperty;
	}
}
