package com.design.pattern.state.widgets;

public class TextBoxTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("Textbox selected");		
	}

	@Override
	public void mouseUp() {
		System.out.println("Textbox enabled");		
	}

}
