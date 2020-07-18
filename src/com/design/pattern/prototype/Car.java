package com.design.pattern.prototype;

import java.util.Objects;

public abstract class Car implements Vehicle, Cloneable {

	protected String color;
	protected int seatingCapacity;
	protected String displacement;

	public Car(String color, int seatingCapacity, String displacement) {
		validate(color, seatingCapacity, displacement);
		this.color = color;
		this.seatingCapacity = seatingCapacity;
		this.displacement = displacement;
	}

	private void validate(String color, int seatingCapacity, String displacement) {
		Objects.requireNonNull(color);
		Objects.requireNonNull(displacement);

		if (seatingCapacity < 1)
			throw new IllegalArgumentException("Car needs to have atleast 1 seat");
		if (displacement.isEmpty() || !displacement.endsWith("cc"))
			throw new IllegalArgumentException("Car displacement incorrect value. Needs to end with 'cc'");

		// verifies if displacement is integer or not
		Integer.parseInt(displacement.split("cc")[0]);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("|Color = ").append(this.color).append("\t|");
		sb.append("Seats = ").append(this.seatingCapacity).append("\t|");
		sb.append("Displacement = ").append(this.displacement);
		return sb.toString();
	}

	public Car clone() throws CloneNotSupportedException {
		// Cloning left to the derived concrete classes
		return null;
	};

	@Override
	public boolean equals(Object obj) {
		return this.color.equalsIgnoreCase(((Car) obj).color)
				&& this.displacement.equalsIgnoreCase(((Car) obj).displacement)
				&& this.seatingCapacity == ((Car) obj).seatingCapacity;
	}
}
