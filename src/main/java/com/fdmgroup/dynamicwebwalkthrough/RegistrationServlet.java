package com.fdmgroup.dynamicwebwalkthrough;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.dynamicwebwalkthrough.usermanagement.RegistrationController;
import com.fdmgroup.dynamicwebwalkthrough.usermanagement.User;
import com.fdmgroup.dynamicwebwalkthrough.usermanagement.UserFactory;

public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String page = null;

		// Logic go here
		String username = req.getParameter("username");
		String password = req.getParameter("password"); // consumes variables,
														// i.e. remove them from
														// request

		RegistrationController regController = new RegistrationController();
		boolean registered = regController.regUser(username, password);

		if (registered) {
			page = "WEB-INF/registrationConfirm.jsp";
			// Add the username String back to the request
			UserFactory userFactory = new UserFactory();
			User user = userFactory.createUser(username);
			req.setAttribute("user", user);
		} else {
			page = "registrationPage.jsp";
		}

		// Perform a simple redirect
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		dispatcher.forward(req, resp);
	}
}
