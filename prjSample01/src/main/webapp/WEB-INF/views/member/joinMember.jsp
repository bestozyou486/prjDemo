<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>member insert</title>
<style type="text/css">
.msg{
	color:red;
}
</style>
</head>
<body>
	<form:form commandName="member" action="./join" method="post">
		id : <form:input path="id"/><form:errors path="id" cssClass="msg"></form:errors><br/>
		name : <form:input path="name"/><form:errors path="name" cssClass="msg"></form:errors><br/>
		address : <form:input path="address"/><form:errors path="name" cssClass="msg"></form:errors><br/>
		<input type="submit" value="insert"/>
		<input type="reset" value="cancel"/>
	</form:form>
</body>
</html> 