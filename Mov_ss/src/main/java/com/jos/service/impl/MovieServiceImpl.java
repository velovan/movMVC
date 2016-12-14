package com.jos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jos.dao.MovieDao;
import com.jos.model.Movie;
import com.jos.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;
	
	@Transactional
	public void add(Movie movie) {
		movieDao.add(movie);
	}

	@Transactional
	public void edit(Movie movie) {
		movieDao.edit(movie);
	}

	@Transactional
	public void delete(int id) {
		movieDao.delete(id);
	}

	@Transactional
	public Movie getMovie(int id) {
		return movieDao.getMovie(id);
	}

	@Transactional
	public List getAllMovie() {
		return movieDao.getAllMovie();
	}

}
