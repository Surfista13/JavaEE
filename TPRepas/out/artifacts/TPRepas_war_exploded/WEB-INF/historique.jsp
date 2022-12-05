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
        <td><%=request.getAttribute("date")%></td>
        <td><%=request.getAttribute("time")%></td>
        <td><a href="#">détails</a></td>
      </tr>
      <tr>
        <td class="details" colspan="3">
          <ul>
            <li>Aliment 1</li>
            <li>Aliment 2</li>
            <li>Aliment 3</li>
            <li>Aliment 4</li>
          </ul>
        </td>
      </tr>
      <tr>
        <td>08/12/2022</td>
        <td>12h30</td>
        <td><a href="#">détails</a></td>
      </tr>
    </tbody>

  </table>
  </br>
  <a href="/TPRepas/ServletAjoutRepas"><button>Ajouter un nouveau repas</button></a>
  <a href="/TPRepas/ServletAccueil"><button>Retour à l'accueil</button></a>
</body>
</html>
