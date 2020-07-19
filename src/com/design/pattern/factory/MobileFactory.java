package com.design.pattern.factory;

public final class MobileFactory {

	private MobileFactory() {
	}

	public static Mobile manufacture(String type) {
		switch (type) {
		case Mobile.IPHONE_6S:
			return new IPhone();
		case Mobile.MOTO_G4:
			return new GFour();
		case Mobile.SAMSUNG_GALAXY_S6:
			return new GalaxySix();

		default:
			throw new IllegalArgumentException(type + " not yet in production!");
		}
	}
}
