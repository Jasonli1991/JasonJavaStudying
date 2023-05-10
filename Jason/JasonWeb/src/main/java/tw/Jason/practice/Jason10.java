package tw.Jason.practice;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/Jason10")
//檔案上傳
@MultipartConfig(
		location = "/Users/chihchungli/git/Jason/JasonWeb/src/main/webapp/upload"
		)
public class Jason10 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Collection<Part> parts = request.getParts();
//		for (Part part : parts) {
//			String name = part.getName();
//			System.out.println(name);
//		}
		
		Part upload = request.getPart("upload");
		System.out.println("Size:" + upload.getSize());
		System.out.println("Type:" + upload.getContentType());
		System.out.println("fname:" + upload.getSubmittedFileName());
		
		upload.write(upload.getSubmittedFileName());
	}

}
