
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Présentation des différents objets disponibles</title>
</head>
<body>
<h1>request</h1>
<p><%=request.getContextPath()%></p>
<h1>response</h1>
<p><%=response.getStatus()%></p>
    <p><%out.print("bonjour");%></p>


</body>
</html>
