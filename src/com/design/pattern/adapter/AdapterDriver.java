package com.design.pattern.adapter;

public class AdapterDriver {

	public static void main(String[] args) {
		StreetFighter aFighter = new StreetFighter(new WizardFighterAdapter());
		aFighter.fight();
		aFighter.drive();
		System.err.println("Magic powers obtained");
		aFighter.spellMagic();
		aFighter.fly();
	}
}
