package com.design.pattern.adapter.mediaplayer;

/**
 * The target format
 * 
 * @author abhijeet.ashri
 *
 */

@FunctionalInterface
public interface MediaPackage {

	void playFile(String filename);
}
