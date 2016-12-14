package com.jos.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jos.dao.MovieDao;
import com.jos.model.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Movie movie) {
		session.getCurrentSession().save(movie);
	}

	@Override
	public void edit(Movie movie) {
		session.getCurrentSession().update(movie);
	}

	@Override
	public void delete(int id) {		
		session.getCurrentSession().delete(getMovie(id));
	}

	@Override
	public Movie getMovie(int id) {
		return (Movie)session.getCurrentSession().get(Movie.class, id);
	}

	@Override
	public List getAllMovie() {
		return session.getCurrentSession().createQuery("from Movie").list();
	}

}
