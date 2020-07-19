package com.design.pattern.adapter.mediaplayer;

public class VLC implements MediaPackage {

	@Override
	public void playFile(String filename) {
		System.out.println("Using ADAPTEE - Playing VLC format using adapter");
		System.out.println(String.format("Playing %s", filename));
	}

}
