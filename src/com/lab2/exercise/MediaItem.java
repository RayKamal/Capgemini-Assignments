package com.lab2.exercise;

public abstract class MediaItem extends Item {
	private int runtime;
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runtime == otherMediaItem.runtime;
		}
}
