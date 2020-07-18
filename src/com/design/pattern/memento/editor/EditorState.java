package com.design.pattern.memento.editor;

//This class is the "memento"
public final class EditorState {
	private final String content;

	public EditorState(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
