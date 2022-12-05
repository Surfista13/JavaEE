package fr.eni.repas.controleurs;

import fr.eni.repas.bll.RepasManager;
import fr.eni.repas.bo.Repas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/ServletVisualisation")
public class ServletVisualisation extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Repas> desRepas = new ArrayList<>();
        RepasManager rm = new RepasManager();
        desRepas = rm.findAll();
        request.setAttribute("listeRepas",desRepas);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/historique.jsp");
        rd.forward(request,response);
    }
}
