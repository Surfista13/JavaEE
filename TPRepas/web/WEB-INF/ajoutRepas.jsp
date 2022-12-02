
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout repas</title>
</head>
<body>
    <h1>AJOUT</h1>
    <form method="post" action="/TPRepas/ServletAjoutRepas">
        <label>date</label>
        </br>
        <input type="date" name="daterepas" id="date" required>
        </br>
        <label>heure</label>
        </br>
        <input type="time" name="timerepas" id="time" required>
        </br>
        <label>repas</label>
        </br>
        <textarea rows="5" cols="60" name="repas" placeholder="Saisir aliment avec une virgule"></textarea>
        </br>
        <input type="submit" value="Valider"/>
        <input type="reset" value="Annuler" onclick='location.href="/TPRepas/ServletAccueil"'/>
    </form>

</body>
</html>
