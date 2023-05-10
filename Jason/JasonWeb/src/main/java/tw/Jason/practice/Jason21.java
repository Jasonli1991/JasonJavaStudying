package tw.Jason.practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jason21")
public class Jason21 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source = "/Users/chihchungli/git/Jason/JasonJava/dir1/one-handed-push-up.jpeg";
		BufferedImage img = ImageIO.read(new File(source));
		Graphics2D g2d = img.createGraphics();
		
		Font font = new Font(null, Font.BOLD + Font.ITALIC, 48);
		
		//變形
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(-10));
		Font font2 = font.deriveFont(tran);
		
		g2d.setColor(Color.BLUE);
		g2d.setFont(font2);
		//(0,0的位置在基線)
		g2d.drawString("one-handed-push-up", 200, 200);
		
		response.setContentType("image/jpeg");
		OutputStream os = response.getOutputStream();
		ImageIO.write(img, "jpeg", os);
		
		//另存新檔
		//ImageIO.write(img, "jpeg", new FileImageOutputStream(new File("/Users/chihchungli/git/Jason/JasonWeb/src/main/webapp/dir1/pushUpCat.jpg")));
		
		response.flushBuffer();
	}


}
