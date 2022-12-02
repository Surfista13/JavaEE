<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
  //Déclarations
  private int nombreAppel;
  private int getNombreAppel()
  {
    return this.nombreAppel;
  }
  private void setNombreAppel(int nombreAppel){
    this.nombreAppel = nombreAppel;
  }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Présentation des élèments de script</title>
</head>
<body>
  <%
    //this.nombreAppel++;
    this.setNombreAppel(this.getNombreAppel()+1);
  %>
  Nombre d'appels de la JSP: <%= this.getNombreAppel() %>
  <input type="text" value="<%= this.getNombreAppel() %>"/>

  <a href="/TPJavaEE/modules/module2/ServletPresentationElementDeScript">Rafraichir</a>
</body>
</html>
