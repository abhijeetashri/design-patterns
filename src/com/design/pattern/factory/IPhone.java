package com.design.pattern.factory;

public class IPhone extends AbstractMobile implements Mobile {

	public IPhone() {
		super(2, 16);
	}

	@Override
	public String manufacturerName() {
		return "Apple";
	}
}
