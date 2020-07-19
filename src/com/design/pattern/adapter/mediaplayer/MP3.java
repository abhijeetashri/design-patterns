package com.design.pattern.adapter.mediaplayer;

public class MP3 implements MediaPlayer {

	@Override
	public void play(String filename) {
		System.out.println("The source application supports MP3 format");
		System.out.println(String.format("Playing %s", filename));
	}
}
