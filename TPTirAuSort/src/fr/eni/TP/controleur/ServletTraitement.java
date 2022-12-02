package fr.eni.TP.controleur;

import fr.eni.TP.bll.TraitMetier;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/TP/ServletTraitement",
        initParams = {
            @WebInitParam(
                    name="MIN",
                    value="0"
            ),
                @WebInitParam(
                        name="MAX",
                        value="100"
                )
        }
)
public class ServletTraitement extends HttpServlet {
    int numIA = 0;
    String min = "";
    String max = "";
    int min2 = 0;
    int max2 = 0;
    TraitMetier traitement = new TraitMetier();


    //initialisation de la servlet avec les paramètres min et max qui vont être passé à la méthode random
    public void init(){
        String min = "";
        String max = "";
        int min2 = 0;
        int max2 = 0;
        numIA = traitement.Ramdom(min2,max2);

    }
    @Override
    //Méthode doPost qui va initialiser la page Resultat.jsp
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        min = this.getInitParameter("MIN");
        max = this.getInitParameter("MAX");
        min2 = Integer.parseInt(min);
        max2 = Integer.parseInt(max);
        int param = Integer.parseInt(request.getParameter("number"));
        if(param < getMin2() || param > getMax2()){
            response.sendRedirect("../index.html");
        } else {
            traitement.Resultat(request,response);
            this.getServletContext().getRequestDispatcher( "/WEB-INF/Resultat.jsp" ).forward( request, response );
        }
    }

    public int getMin2() {
        return min2;
    }

    public int getMax2() {
        return max2;
    }
}
