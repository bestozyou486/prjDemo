<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h5>
	testDemo
</h5>

<P>  The time on the server is ${serverTimes}. </P>
<%= request.getAttribute("serverTimes") %>
</body>
</html>
