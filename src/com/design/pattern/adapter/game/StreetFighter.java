package com.design.pattern.adapter.game;

public class StreetFighter {

	private WizardFighterAdapter adapter;

	public StreetFighter(WizardFighterAdapter adapter) {
		this.adapter = adapter;
	}

	public void fight() {
		System.out.println("Punches & Kicks!");
	}

	public void drive() {
		System.out.println("Drive Car");
	}

	public void spellMagic() {
		this.adapter.spellMagic();
	}

	public void fly() {
		this.adapter.fly();
	}
}