package fr.eni.repas.testunitaires;

import fr.eni.repas.bo.Repas;
import fr.eni.repas.dal.ConnectionProvider;
import fr.eni.repas.dal.DAO;
import fr.eni.repas.dal.DAOFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/ServletTestDAL")
public class ServletTestDAL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try{
        Connection cnx = ConnectionProvider.getConnection();
            DAO<Repas> repasDAO =  DAOFactory.getRepasDAO();
            List<Repas> desRepas = new ArrayList<>();
            desRepas = repasDAO.selectAll();
            for (Repas repas : desRepas){
                out.print(repas + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        out.close();
    }
}
