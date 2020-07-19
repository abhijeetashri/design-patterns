package com.design.pattern.adapter.mediaplayer;

public class MediaPlayerDriver {

	public static void main(String[] args) {
		MediaPlayer mediaPlayer = new MP3();
		mediaPlayer.play("mp3-file.mp3");
		System.out.println("*******************************************");

		mediaPlayer = new MediaFormatAdapter(new MP4());
		mediaPlayer.play("mp4-file.mp4");
		System.out.println("*******************************************");

		mediaPlayer = new MediaFormatAdapter(new VLC());
		mediaPlayer.play("VLC-file.vlc");
	}
}
