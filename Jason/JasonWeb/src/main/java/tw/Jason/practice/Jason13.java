package tw.Jason.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jason13")
public class Jason13 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Jason14");
		
		request.setAttribute("x", 123);
		request.setAttribute("y", 456);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>Jason Big Company</h1>");
		
		dispatcher.include(request, response);
		
		out.print("<hr /> ");
		out.print("Hello, World");
	}

}
