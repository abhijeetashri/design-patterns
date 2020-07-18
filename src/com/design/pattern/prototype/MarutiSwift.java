package com.design.pattern.prototype;

import java.util.Objects;

public class MarutiSwift extends Car {

	private boolean hasOrvm;

	public MarutiSwift(String color, int seatingCapacity, String displacement, boolean hasOrvm) {
		super(color, seatingCapacity, displacement);
		this.hasOrvm = hasOrvm;
	}

	public boolean hasOrvm() {
		return hasOrvm;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append("\t|ORVMs = ").append(this.hasOrvm() ? "Yes" : "No");
		return sb.toString();
	}

	@Override
	public Car clone() throws CloneNotSupportedException {
		return new MarutiSwift(this.color, this.seatingCapacity, this.displacement, this.hasOrvm);
	}

	@Override
	public boolean equals(Object obj) {
		if (Objects.isNull(obj))
			return false;
		if (!(obj instanceof MarutiSwift))
			return false;
		return super.equals(obj) && this.hasOrvm == ((MarutiSwift) obj).hasOrvm;
	}
}
