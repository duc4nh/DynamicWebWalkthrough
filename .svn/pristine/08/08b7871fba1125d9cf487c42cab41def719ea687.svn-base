package com.fdmgroup.dynamicwebwalkthrough;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dynamicwebwalkthrough.moviemanagement.Movie;
import com.fdmgroup.dynamicwebwalkthrough.moviemanagement.MovieController;

public class MoviesServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		MovieController movieController = new MovieController();
		List<Movie> movies = movieController.getAllMovie();
		req.setAttribute("movies", movies);
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/movies.jsp");
		dispatcher.forward(req, resp);
	}
}
