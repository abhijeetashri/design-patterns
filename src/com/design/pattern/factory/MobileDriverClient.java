package com.design.pattern.factory;

public class MobileDriverClient {

	public static void main(String[] args) {
		Mobile mobile = MobileFactory.manufacture(Mobile.IPHONE_6S);
		System.out.println("Manufactured iPhone specifications");
		System.out.println(mobile);

		mobile = MobileFactory.manufacture(Mobile.MOTO_G4);
		System.out.println("Manufactured Motorola specifications");
		System.out.println(mobile);

		mobile = MobileFactory.manufacture(Mobile.SAMSUNG_GALAXY_S6);
		System.out.println("Manufactured Samsung specifications");
		System.out.println(mobile);
	}
}
