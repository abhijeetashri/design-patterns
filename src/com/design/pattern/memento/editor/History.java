package com.design.pattern.memento.editor;

import java.util.ArrayList;
import java.util.List;

//This class is the "caretaker"
public class History {

	private List<EditorState> states = new ArrayList<>();

	public void add(EditorState state) {
		states.add(state);
	}

	public EditorState pop() {
		int lastIndex = states.size() - 1;
		return states.remove(lastIndex);
	}
}
