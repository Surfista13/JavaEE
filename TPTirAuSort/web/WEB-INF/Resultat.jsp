<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <link href="../style.css" rel="stylesheet" type="text/css">
  </head>
  <body>
  <p class="round">Round n° <%=request.getAttribute("Round")%></p>
  <p class="resultat"><%=request.getAttribute("Resultat")%></p>
  <p><%=request.getAttribute("Bouton")%></p>
  </body>
</html>
