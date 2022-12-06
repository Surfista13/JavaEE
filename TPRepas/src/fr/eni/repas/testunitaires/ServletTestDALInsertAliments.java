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
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(value = "/ServletTestDALInsertAliments")
public class ServletTestDALInsertAliments extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int key;
        try{
        Connection cnx = ConnectionProvider.getConnection();
            DAO<Repas> repasDAO =  DAOFactory.getRepasDAO();
            repasDAO.insertAliment("Choux",3);
            out.print("Test insertAliment OK");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        out.close();
    }
}
