package com.tutorial.sessiontracking.httpsession.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateAdminCotroller  extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	
	}

}
