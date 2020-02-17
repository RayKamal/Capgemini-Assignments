package com.lab2.exercise;

public class Video extends MediaItem {
	private String directior;
	public String getDirectior() {
		return directior;
	}
	public void setDirectior(String directior) {
		this.directior = directior;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private String genre;
	private int year;
}
	

