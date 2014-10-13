package com.example.androidlistview.model;

import java.util.ArrayList;

public class Movie {
	private String title;
	private String thumbnailUrl;
	private int year;
	private double rating;
	private ArrayList<String> genres;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}
	public String getTitle() {
		return title;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public int getYear() {
		return year;
	}
	public double getRating() {
		return rating;
	}
	public ArrayList<String> getGenres() {
		return genres;
	}
	
}
