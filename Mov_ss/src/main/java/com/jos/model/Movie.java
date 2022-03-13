package com.jos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int id;
	@Column
	private String title;
	@Column
	private String director;
	
//	@Column
//	private int yearLevel;
	
	public Movie(){}
	public Movie(int id, String title, String director /*,int yearLevel*/) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		
//		this.yearLevel = yearLevel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
//	public int getYearLevel() {
//		return yearLevel;
//	}
//	public void setYearLevel(int yearLevel) {
//		this.yearLevel = yearLevel;
//	}
	
}
