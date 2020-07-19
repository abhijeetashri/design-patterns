package com.design.pattern.factory;

public class GalaxySix extends AbstractMobile implements Mobile {

	public GalaxySix() {
		super(3, 32);
	}

	@Override
	public String manufacturerName() {
		return "Samsung";
	}
}
