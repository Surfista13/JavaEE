package fr.eni.chifumi.bll;

import fr.eni.chifumi.traitement.ServletTraitement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;

public class Metier {

    public int random (){
        String result="";
        Random r = new Random();
        int choice = r.nextInt(3);
        return choice;
    }

    public String traduction(int choice){
        String result="";
        switch (choice){
            case 0 : result ="PIERRE";
                break;
            case 1 : result ="FEUILLE";
                break;
            case 2 : result ="CISEAUX";
                break;
        }
        return result;
    }
    public void traitement (ServletTraitement sv,HttpServletRequest req,int param, int choiceIA){

            if(param == choiceIA) {
                req.setAttribute("result", "Egalité");
                sv.setScoreIA(1);
                sv.setScore(1);
            }
            if((choiceIA - param) == 2 || (choiceIA - param) == -1){
                req.setAttribute("result","Vous avez Gagné");
                sv.setScore(1);
            } else {
                req.setAttribute("result","Vainqueur IA");
                sv.setScoreIA(1);
            }

        req.setAttribute("score",sv.getScore());
        req.setAttribute("scoreIA",sv.getScoreIA());
    }
}
