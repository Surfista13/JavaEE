
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout repas</title>
   <link href="./StyleAjoutRepas.css" rel="stylesheet">
</head>
<body>
    <h1>AJOUT REPAS</h1>
    <form method="post" action="/TPRepas/ServletAjoutRepas">
        <label class="date">date</label>
        <input type="date" name="daterepas" id="date" required>
        </br>
        <label>heure</label>
        <input type="time" name="timerepas" id="time" required>
        </br>
        <div class="details">
            <label>repas</label>
            <textarea rows="5" cols="60" name="repas" placeholder="Saisir aliment avec une virgule"></textarea>
            </br>
        </div>
        <div class="bouton">
            <input type="submit" value="Valider"/>
            <input type="reset" value="Annuler" onclick='location.href="/TPRepas/ServletAccueil"'/>
        </div>

    </form>

</body>
</html>
