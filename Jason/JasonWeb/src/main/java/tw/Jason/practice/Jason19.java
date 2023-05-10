package tw.Jason.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.Jason.tools.JasonUtils;

@WebServlet("/Jason19")
public class Jason19 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = (String)request.getAttribute("x");
		String y = (String)request.getAttribute("y");
		String result = (String)request.getAttribute("result");
		String view = (String)request.getAttribute("view");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			String content = JasonUtils.loadView(view);
			out.print(String.format(content, view, x, y, result));
		}catch(Exception e1) {
			//目的要讓使用者填入除了view1、view2以外的版面可以正常運行，採view1版面
			try {
				String content = JasonUtils.loadView("view1");
				out.print(String.format(content, view, x, y, result));
			}catch(Exception e2) {
				
			}
		}
	}

}
