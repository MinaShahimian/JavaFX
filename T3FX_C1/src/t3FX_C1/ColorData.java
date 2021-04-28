package t3FX_C1;

import javafx.scene.paint.Color;

public class ColorData {
	private String name;
	private Color color;

	public ColorData(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return name;
	}

}
