package tw.Jason.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jason14")
public class Jason14 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		Integer x = (Integer) request.getAttribute("x");
		Integer y = (Integer) request.getAttribute("y");

		response.getWriter().append("Hello, " + name + "<br />").append("x = " + x + ";" + " y = " + y);

	}

}
