package fr.eni.javaee.module2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/modules/module2/ServletPresentationObjets")
public class ServletPresentationObjets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/presentationDesPrincipauxObjets.jsp");
        rd.forward(request,response);
    }
}
