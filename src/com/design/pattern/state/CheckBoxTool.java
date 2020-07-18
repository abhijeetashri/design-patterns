package com.design.pattern.state;

public class CheckBoxTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Checkbox selected");
	}

	@Override
	public void mouseUp() {
		System.out.println("Checkbox drawn");
	}
}
