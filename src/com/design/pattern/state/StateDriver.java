package com.design.pattern.state;

public class StateDriver {

	public static void main(String[] args) {
		Tool tool = new CheckBoxTool();
		tool.mouseDown();
		tool.mouseUp();

		tool = new RadioButtonTool();
		tool.mouseDown();
		tool.mouseUp();

		tool = new TextBoxTool();
		tool.mouseDown();
		tool.mouseUp();
	}
}
