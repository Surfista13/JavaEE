package fr.eni.javaee.module2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/modules/module2/ServletFournissantInfoALaJsp")
public class ServletFournissantInfoALaJsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("uneCle","UneValeur");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jspAffichantInfoFournitParServlet.jsp");
        rd.forward(request,response);
    }



}
