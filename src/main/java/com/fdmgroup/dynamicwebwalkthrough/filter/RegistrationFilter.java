package com.fdmgroup.dynamicwebwalkthrough.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegistrationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		// some code here to work out a user's country based on their IP
		// Set an attribute inside the request
		if (req.getParameter("username").equals("Jon")) {
			req.setAttribute("country", "UK");
		} else {
			req.setAttribute("country", "France");
		}

		// Foward on to either the next filter or the servlet
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// Can leave empty
	}

	@Override
	public void destroy() {
		// Can leave empty
	}
}
