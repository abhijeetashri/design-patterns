package com.design.pattern.memento.game;

import java.util.ArrayList;
import java.util.List;

// This class is the "caretaker"
public class GameHistory {

	List<GameState> gameStates = new ArrayList<>();

	public void addState(GameState gameState) {
		this.gameStates.add(gameState);
	}

	public GameState remove() {
		int lastIndex = this.gameStates.size() - 1;
		return this.gameStates.remove(lastIndex);
	}
}
