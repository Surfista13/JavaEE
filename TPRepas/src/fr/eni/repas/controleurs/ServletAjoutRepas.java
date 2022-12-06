package fr.eni.repas.controleurs;

import fr.eni.repas.bll.RepasManager;
import fr.eni.repas.bo.Repas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@WebServlet(value = "/ServletAjoutRepas")
public class ServletAjoutRepas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ajoutRepas.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //formatage de la date et l'heure
        LocalDate localDate = LocalDate.parse(req.getParameter("daterepas"));
        LocalTime localTime = LocalTime.parse(req.getParameter("timerepas"));

        //formatage date avant affichage
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dateText = localDate.format(formatters);

       //formatage liste aliments
        String repas = req.getParameter("aliments");
        String desAliments [] = repas.split(",");

        req.setAttribute("date",dateText);
        req.setAttribute("time",localTime);

        RepasManager rm = new RepasManager();
        List<Repas> desRepas = new ArrayList<>();
        desRepas = rm.findAll();
        req.setAttribute("listeRepas",desRepas);
        req.setAttribute("idRecherche",0);


        int key = rm.Add(localDate,localTime);

        for (String a : desAliments){
            rm.AddAliments(a,key);
        }
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/historique.jsp");
        rd.forward(req,resp);
    }
}
