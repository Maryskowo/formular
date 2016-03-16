<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="hello" method="post">
		<label>Kwota:<input type="text" id="kwota" name="kwota"/></label>
		<label>Raty:<input type="text" id="raty" name="raty"/></label>
		<label>Oprocentowanie:<input type="text" id="oprocentowanie" name="oprocentowanie"/></label>
		<label>Oplata:<input type="text" id="oplata" name="oplata"/></label>
		<label>Rodzaj:<input type="text" id="rodzaj" name="rodzaj"/></label>
		<input type="submit" value="wyslij"/>
	</form>
</body>
</html>