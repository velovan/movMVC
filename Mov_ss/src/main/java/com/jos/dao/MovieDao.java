package com.jos.dao;

import java.util.List;

import com.jos.model.Movie;

public interface MovieDao {
	public void add(Movie movie);
	public void edit(Movie movie);
	public void delete(int id);
	public Movie getMovie(int id);
	public List getAllMovie();
}
