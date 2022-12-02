package fr.eni.TP.bll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class TraitMetier {
    int numIA = 0;
    boolean game = false;
    int count = 0;

    //Méthode random sur les bornes min max issues des paramètres de la servlet traitement
    public int Ramdom(int min, int max) {
        Random r = new Random();
        numIA = r.nextInt(min + max +1) + min;
        return numIA;
    }

    //Méthode Resultat qui va fixer les attributs de la request pour utilisation dans la page Resultat.jsp
    public void Resultat (HttpServletRequest request, HttpServletResponse response) throws IOException {
        String param = request.getParameter("number");
        System.out.println(param);
        int num = Integer.parseInt(param);
        System.out.println("reponse: " + numIA);
        if (numIA == num && game == false){
            request.setAttribute("Resultat","Victoire!!!! le nombre a trouvé était " + numIA);
            request.setAttribute("Bouton","");
            game = true;
            count++;
            request.setAttribute("Round",count);
        } else if(numIA == num && game == true){
            request.setAttribute("Resultat","Dommage un joueur à déjà trouvé, c'était bien " + numIA);
            request.setAttribute("Bouton","");
            count++;
            request.setAttribute("Round",count);
        } else {
            request.setAttribute("Resultat","Loupé, essaye encore");
            request.setAttribute("Bouton","<button><a href='/TPTirAuSort/index.html'>BOUTON</a></button>");
            count++;
            request.setAttribute("Round",count);
        }
    }
}
