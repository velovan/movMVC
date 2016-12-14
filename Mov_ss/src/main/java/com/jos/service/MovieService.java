package com.jos.service;

import java.util.List;

import com.jos.model.Movie;

public interface MovieService {
	public void add(Movie movie);
	public void edit(Movie movie);
	public void delete(int id);
	public Movie getMovie(int id);
	public List getAllMovie();
}
