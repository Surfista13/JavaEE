package fr.eni.javaee.module2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/modules/module2/ServletPresentationElementDeScript")
public class ServletPresentationElementDeScript extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PresentationElementsDeScript.jsp");
        rd.forward(request,response);
    }
}
