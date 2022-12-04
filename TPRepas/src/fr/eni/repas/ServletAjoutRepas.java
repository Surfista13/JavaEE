package fr.eni.repas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(value = "/ServletAjoutRepas")
public class ServletAjoutRepas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/ajoutRepas.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = (String) req.getParameter("daterepas");
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/historique.jsp");
        rd.forward(req,resp);

    }
}
