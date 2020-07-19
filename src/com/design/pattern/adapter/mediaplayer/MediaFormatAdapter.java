package com.design.pattern.adapter.mediaplayer;

public class MediaFormatAdapter implements MediaPlayer {

	private MediaPackage mediaPackage;

	public MediaFormatAdapter(MediaPackage mediaPackage) {
		this.mediaPackage = mediaPackage;
	}

	@Override
	public void play(String filename) {
		this.mediaPackage.playFile(filename);
	}
}
