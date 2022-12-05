package fr.eni.repas.dal;

import fr.eni.repas.bo.Repas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RepasDAOImplSQLServer implements DAO<Repas> {

    //Déclaration requêtes
    private static final  String SELECTALL = "SELECT * FROM repas;";
    private static final String SELECTBYID = "SELECT * FROM repas WHERE idAliment = ?;";
    private static final String INSERT = "INSERT INTO repas (dateRepas,heureRepas) VALUES (?,?)";

    @Override
    public List<Repas> selectAll() {
        List<Repas> desRepas= new ArrayList<>();
        Statement stmt;
        Connection cnx;
        ResultSet rs;

        try {
            cnx = ConnectionProvider.getConnection();
            stmt = cnx.createStatement();
            rs = stmt.executeQuery(SELECTALL);
            while (rs.next()){
                Repas repas = new Repas();
                repas.setDate(rs.getDate("dateRepas").toLocalDate());
                repas.setTime(rs.getTime("heureRepas").toLocalTime());
                desRepas.add(repas);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return desRepas;
    }

    @Override
    public Repas selectbyID(int id) {
        return null;
    }

    @Override
    public void insert(Repas repas) {

    }
}
