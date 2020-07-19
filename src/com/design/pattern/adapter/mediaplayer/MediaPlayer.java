package com.design.pattern.adapter.mediaplayer;

/**
 * The source format
 * 
 * @author abhijeet.ashri
 *
 */
@FunctionalInterface
public interface MediaPlayer {

	void play(String filename);
}
