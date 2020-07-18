package com.design.pattern.memento.game;

//This class is the "originator"
public class Game {

	private int highScore;

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public int getHighScore() {
		return highScore;
	}

	public GameState saveGame() {
		return new GameState(highScore);
	}

	public int loadGame(GameState gameState) {
		return gameState.getHighScore();
	}
}

//This class is the "memento"
class GameState {
	private int highScore;

	public GameState(int highScore) {
		this.highScore = highScore;
	}

	public int getHighScore() {
		return highScore;
	}
}