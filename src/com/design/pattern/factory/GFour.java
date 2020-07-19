package com.design.pattern.factory;

public class GFour extends AbstractMobile implements Mobile {

	public GFour() {
		super(4, 64);
	}

	@Override
	public String manufacturerName() {
		return "Motorola";
	}

}
