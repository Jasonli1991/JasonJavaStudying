<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1" style="border-color: black;">
		<% 
		for (int i = 0; i < 2; i++) {
			if (i > 0) {
				out.println("<tr><td colspan='4'></td></tr>");
			}
			out.println("<tr>");
			for (int j = i * 4 + 2; j <= i * 4 + 5; j++) {
				out.println("<td>");
				for (int k = 1; k <= 9; k++) {
					int result = j * k;
					out.println(j + " × " + k + " = " + result + "<br>");
				}
				out.println("</td>");
			}
			out.println("</tr>");
		}
		%>
		</table>
	</body>
</html>