package t3FX_BL1;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Hund {

	private StringProperty name;
	private IntegerProperty alter;

	public Hund(String n, int a) {
		name = new SimpleStringProperty(n);
		alter = new SimpleIntegerProperty(a);
	}

	public String getName() {
		return name.get();
	}

	public int getAlter() {
		return alter.get();
	}

	public void setName(String n) {
		name.set(n);
		;
	}

	public void setAlter(int a) {
		alter.set(a);
		;
	}

	public IntegerProperty alterProperty() {
		return alter;
	}

	public StringProperty nameProperty() {
		return name;
	}
}
