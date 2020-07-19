package com.design.pattern.adapter.mediaplayer;

public class MP4 implements MediaPackage {

	@Override
	public void playFile(String filename) {
		System.out.println("Using ADAPTEE - Playing MP4 format using adapter");
		System.out.println(String.format("Playing %s", filename));
	}

}
