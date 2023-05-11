<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	
	int lottery1 = (int)request.getAttribute("lottery1");
	int lottery2 = (int)request.getAttribute("lottery2");
	
	//String a = request.getParameter("x");
	//String b = request.getParameter("y");
%>
I am Jason<hr/>

<%= x %> | <%= y %><br />
<%= lottery1 %> | <%= lottery2 %><br />