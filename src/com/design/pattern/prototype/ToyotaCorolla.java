package com.design.pattern.prototype;

import java.util.Objects;

public class ToyotaCorolla extends Car {

	private boolean isAutomatic;

	public ToyotaCorolla(String color, int seatingCapacity, String displacement, boolean isAutomatic) {
		super(color, seatingCapacity, displacement);
		this.isAutomatic = isAutomatic;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("\t|Is Automatic= ").append(this.isAutomatic() ? "Yes" : "No");
		return sb.toString();
	}

	@Override
	public Car clone() throws CloneNotSupportedException {
		return new ToyotaCorolla(this.color, this.seatingCapacity, this.displacement, this.isAutomatic);
	}

	@Override
	public boolean equals(Object obj) {
		if (Objects.isNull(obj))
			return false;
		if (!(obj instanceof ToyotaCorolla))
			return false;
		return super.equals(obj) && this.isAutomatic == ((ToyotaCorolla) obj).isAutomatic;
	}
}
