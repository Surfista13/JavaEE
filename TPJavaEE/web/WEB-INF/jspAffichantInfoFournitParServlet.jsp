<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info fourni par Servlet</title>
</head>
<body>
    <% String s = (String) request.getAttribute("uneCle"); %>
    <p><%=s%></p>
</body>
</html>
