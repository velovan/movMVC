package com.jos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jos.model.Movie;
import com.jos.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Movie movie = new Movie();
		map.put("movie", movie);
		map.put("movieList", movieService.getAllMovie());
		return "movie";
		
	}        
	
	/*student.do*/
	@RequestMapping(value="/movie.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Movie movie, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Movie movieResult = new Movie();
		switch(action.toLowerCase()){	
		case "add":
			movieService.add(movie);
			movieResult = movie;
			break;
		case "edit":
			movieService.edit(movie);
			movieResult = movie;
			break;
		case "delete":
			movieService.delete(movie.getId());
			movieResult = new Movie();
			break;
		case "search":
			Movie searchedMovie = movieService.getMovie(movie.getId());
			movieResult = searchedMovie!=null ? searchedMovie : new Movie();
			break;
		}
		map.put("movie", movieResult);
		map.put("movieList", movieService.getAllMovie());
		return "movie";
	}	
}
