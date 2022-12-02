
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Resultat</title>
</head>
<body>
<h1>Résultat du PIERRE FEUILLE CISEAUX</h1>
<%String result = (String) request.getAttribute("result");%>
<h1><%=result%></h1>
</br>
<%String IA = (String) request.getAttribute("choiceIA");%>
<h2>L'ordinateur a joué : <%=IA%></h2>

<%String player = (String) request.getAttribute("param");%>
<h2>Vous avez joué : <%=player%></h2>
</br>
<%String scorePlayer = request.getAttribute("score").toString();%>
<%String scoreIA = request.getAttribute("scoreIA").toString();%>
</br>
<h2>IA : <%=scoreIA%>   VS   Player : <%=scorePlayer%></h2>
</br>
</br>
<button><a href="../index.html">REJOUER</a></button>

</body>
</html>
