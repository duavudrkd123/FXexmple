package basic.control;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Phone {
	StringProperty model;
	IntegerProperty price;
	
	public void setModel(String model) {
		this.model.set(model);
		
	}
	public String getModel() {
		return this.model.get();
		
	}
	public StringProperty modelProperty() {
		return this.model;
	}

}
