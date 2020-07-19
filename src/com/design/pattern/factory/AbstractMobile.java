package com.design.pattern.factory;

public abstract class AbstractMobile {

	private int ram;
	private int storage;

	public AbstractMobile(int ram, int storage) {
		this.ram = ram;
		this.storage = storage;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	@Override
	public String toString() {
		return "RAM= " + this.getRam() + "GB\t| Storage= " + this.getStorage() + "GB";
	}
}
