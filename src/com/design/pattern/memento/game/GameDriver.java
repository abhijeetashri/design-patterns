package com.design.pattern.memento.game;

public class GameDriver {

	private static final String GAME_STATE_SAVED = "Game state saved";
	private static final String GAME_STATE_LOADED = "Game state loaded";

	public static void main(String[] args) {
		Game game = new Game();
		GameHistory gameHistory = new GameHistory();

		game.setHighScore(1000);
		gameHistory.addState(game.saveGame());
		System.out.println(GAME_STATE_SAVED);

		game.setHighScore(2000);
		gameHistory.addState(game.saveGame());
		System.out.println(GAME_STATE_SAVED);

		game.setHighScore(3000);
		gameHistory.addState(game.saveGame());
		System.out.println(GAME_STATE_SAVED);

		System.out.println("******** Loading of game starts ********");

		System.out.println(game.loadGame(gameHistory.remove()));
		System.out.println(GAME_STATE_LOADED);

		System.out.println(game.loadGame(gameHistory.remove()));
		System.out.println(GAME_STATE_LOADED);

		System.out.println(game.loadGame(gameHistory.remove()));
		System.out.println(GAME_STATE_LOADED);
	}
}
