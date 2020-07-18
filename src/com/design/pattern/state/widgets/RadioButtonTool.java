package com.design.pattern.state.widgets;

public class RadioButtonTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Radio button selected");		
	}

	@Override
	public void mouseUp() {
		System.out.println("Radio button clicked!");		
	}

}
