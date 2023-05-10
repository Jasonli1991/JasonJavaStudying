<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Jason Big Company</h1>
		<hr />
		<!-- jsp網頁的隱含物件，不需new -->
		<!-- 網頁原始碼僅出現結果 -->
		Welcome, <% out.print("Jason"); %>
	</body>
</html>