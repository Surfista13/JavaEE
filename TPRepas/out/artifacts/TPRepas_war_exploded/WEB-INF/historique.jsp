<%@ page import="fr.eni.repas.bo.Repas" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="fr.eni.repas.bo.Aliment" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Historique des repas</title>
    <link href="./StyleHistorique.css" rel="stylesheet">
</head>
<body>
  <h1>HISTORIQUE</h1>
  </br>
  <table>
    <thead>
      <tr>
        <th>Date</th>
        <th>Heure</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <%
          DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
          List<Repas> listeRepas = (List<Repas>)request.getAttribute("listeRepas");
          List<Aliment> aliments = (List<Aliment>) request.getAttribute("listeAliments");
          for(Repas repas : listeRepas) {
            String dateText = repas.getDate().format(formatters);
        %>
        <td><%=dateText%></td>
        <td><%=repas.getTime()%></td>
        <td><a href="/TPRepas/ServletVisualisation?idRepas=<%=repas.getIdRepas()%>">détails</a></td>
      </tr>
        <%if(repas.getIdRepas() == (int)request.getAttribute("idRecherche")){
          %>
          <tr>
            <td colspan="3">
              <ul>
                <%for(Aliment aliment : aliments) {
                %>
                <li><%=aliment.getNomAliment()%></li>
                <%
                  }
                %>
              </ul>

            </td>
          </tr>
        <%
        }
        %>
        <%
          }
        %>
    </tbody>
  </table>

  </br>
  <a href="/TPRepas/ServletAjoutRepas"><button>Ajouter un nouveau repas</button></a>
  <a href="/TPRepas/ServletAccueil"><button>Retour à l'accueil</button></a>
</body>
</html>
