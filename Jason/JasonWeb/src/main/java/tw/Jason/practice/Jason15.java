package tw.Jason.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.Jason.tools.Bike;

@WebServlet("/Jason15")
public class Jason15 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Jason16");
		
		
		Bike b1 = new Bike();
		b1.upSpeed(); b1.upSpeed(); b1.upSpeed(); b1.upSpeed();
		
		request.setAttribute("b1", b1);
	
		dispatcher.forward(request, response);

		
	}


}