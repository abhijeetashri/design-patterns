package com.design.pattern.memento.editor;

public class MementoDriver {

	public static void main(String[] args) {
		Editor editor = new Editor();
		History history = new History();
		
		editor.setContent("Hello!");
		history.add(editor.save());
		editor.setContent("Hello World!");
		history.add(editor.save());
		System.out.println(editor.undo(history.pop()));
		System.out.println(editor.undo(history.pop()));
	}
}
