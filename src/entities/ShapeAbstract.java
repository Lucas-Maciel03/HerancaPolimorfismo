package entities;

import entities.enums.Color;

public abstract class ShapeAbstract {
	private Color color;

	public ShapeAbstract() {

	}

	public ShapeAbstract(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();
}
