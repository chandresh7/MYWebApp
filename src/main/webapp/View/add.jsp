<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>home Page</title>
</head>

<body>
<%--<h3>Hi ${obj.cname}</h3><br>--%>
<%--<h6>Your Coding Language ${obj.language}</h6>--%>
<form action="addcoder">
    CoderName:<input type="text" name="cname">
    Language:<input type="text" name="language">
    <input type="submit" value="Add">

</form>
</body>
</html>
