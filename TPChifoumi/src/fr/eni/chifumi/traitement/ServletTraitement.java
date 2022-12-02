package fr.eni.chifumi.traitement;

import fr.eni.chifumi.bll.Metier;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(value = "/traitement/ServletTraitement")
public class ServletTraitement extends HttpServlet {

    int param = 0;
    int choiceIA = 0;

    int scoreIA;
    int score;

    Metier metier = new Metier();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        param = Integer.parseInt(req.getParameter("choice"));
        choiceIA = metier.random();
        String paramTrad = metier.traduction(param);
        String choiceIATrad = metier.traduction(choiceIA);
        req.setAttribute("param",paramTrad);
        req.setAttribute("choiceIA",choiceIATrad);

        metier.traitement(this,req,param,choiceIA);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/Resultat.jsp");
        rd.forward(req,resp);
    }

    public void setScoreIA(int scoreIA) {
        this.scoreIA = this.scoreIA + scoreIA;
    }

    public void setScore(int score) {
        this.score = this.score + score;
    }

    public int getScoreIA() {
        return scoreIA;
    }

    public int getScore() {
        return score;
    }
}
