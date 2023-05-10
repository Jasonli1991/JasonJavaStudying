package tw.Jason.tools;

import java.io.BufferedReader;
import java.io.FileReader;
public class JasonUtils {
	public static String loadView(String view) throws Exception {
		String viewFile = 
				String.format(
						"/Users/chihchungli/git/Jason/JasonWeb/src/main/webapp/views/%s.html"
						, view);
				
		BufferedReader reader = 
				new BufferedReader(new FileReader(viewFile));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			return sb.toString();
		
	}
}
