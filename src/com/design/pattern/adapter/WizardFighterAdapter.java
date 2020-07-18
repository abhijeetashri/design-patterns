package com.design.pattern.adapter;

public class WizardFighterAdapter {

	private Wizard wizard;

	public WizardFighterAdapter() {
		wizard = new Wizard();
	}

	public void spellMagic() {
		this.wizard.spellMagic();
	}

	public void fly() {
		this.wizard.flyBroom();
	}
}
