package entities;

import entities.enums.Color;

public class CircleAbstract extends ShapeAbstract {
	private Double radius;

	public CircleAbstract() {
		super();
	}

	public CircleAbstract(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
