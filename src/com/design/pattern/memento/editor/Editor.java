package com.design.pattern.memento.editor;

//This class is the "originator"
public class Editor {

	private StringBuilder content = new StringBuilder();

	public void setContent(String content) {
		this.content.append(content);
	}

	public String getContent() {
		return content.toString();
	}

	public EditorState save() {
		return new EditorState(content.toString());
	}

	public String undo(EditorState state) {
		return state.getContent();
	}
}
