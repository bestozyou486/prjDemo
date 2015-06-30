<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	border-style: solid;
	border-width: 1px;
	font-size: 300%;
}
	td:hover {
	background-color: cyan;
}
#hoverResult {
	color: green;
	font-size: 200%;
}
</style>
</head>
<body>
	<section>
		<!-- create a table with a 3 by 3 cell display -->
		<table>
			<tr>
				<td>A1</td> <td>A2</td> <td>A3</td>
			</tr>
			<tr>
				<td>B1</td> <td>B2</td> <td>B3</td>
			</tr>
			<tr>
				<td>C1</td> <td>C2</td> <td>C3</td>
			</tr>
		</table>
		<div>
			Focus the button, hover over the table cells, and hit Enter to identify them
			using querySelector('td:hover').
		</div>
		<button type="button" id="findHover" autofocus>Find 'td:hover' target</button>
		
		<div id="hoverResult">
		</div>
		
		<script type="text/javascript">
			document.getElementById("findHover").onclick = function() {
				var hovered = document.querySelector("td:hover");
			if (hovered)
				document.getElementById("hoverResult").innerHTML = hovered.innerHTML;
			}
		</script>
	</section>
</body>
</html>