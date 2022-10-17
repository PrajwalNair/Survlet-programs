package com.xworkz.room.survlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.room.dto.RoomDTO;
@WebServlet(loadOnStartup = 5,urlPatterns = "/good")
public class RoomSurvlet extends HttpServlet {
	List<RoomDTO> dtos = new ArrayList();
	
	public RoomSurvlet() {
		System.out.println(getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String id = req.getParameter("id");
		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		String location = req.getParameter("location");
		System.out.println(id);
		System.out.println(country);
		System.out.println(state);
		System.out.println(city);
		System.out.println(location);
		PrintWriter w = resp.getWriter();
		w.append("<html>")
		.append("<h1>")
		.append("Room details is successfull")
		.append("<h1/>")
		.append("<body>")
		.append(id).append("<br/>")
		.append(country).append("<br/>")
		.append(state).append("<br/>")
		.append(city).append("<br/>")
		.append(location).append("<br/>")
		.append("<body/>")
		.append("<html>");
		
		
		RoomDTO dto = new RoomDTO(Integer.parseInt(id),country,  state, city, location);
		dtos.add(dto);
		
		
	}

}
