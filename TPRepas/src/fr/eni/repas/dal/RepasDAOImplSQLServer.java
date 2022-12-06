package fr.eni.repas.dal;

import fr.eni.repas.bo.Aliment;
import fr.eni.repas.bo.Repas;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepasDAOImplSQLServer implements DAO<Repas> {

    //Déclaration requêtes
    private static final  String SELECTALL = "SELECT * FROM repas;";
    private static final String SELECTBYID = "SELECT * FROM repas WHERE idRepas = ?;";
    private static final String SELECTBYIDALIMENTS = "SELECT * FROM aliments WHERE idRepas = ?;";
    private static final String INSERT = "INSERT INTO repas (dateRepas,heureRepas) VALUES (?,?);";
    private static final String INSERT_ALIMENTS = "INSERT INTO aliments (nomAliment,idRepas) VALUES (?,?);";
    List<Repas> desRepas;
    Repas repas;
    List<Aliment> aliments;
    Aliment aliment;
    @Override
    public List<Repas> selectAll() {

        Statement stmt;
        Connection cnx;
        ResultSet rs;


        try {
            desRepas = new ArrayList<>();
            cnx = ConnectionProvider.getConnection();
            stmt = cnx.createStatement();
            rs = stmt.executeQuery(SELECTALL);
            while (rs.next()){
                repas = new Repas();
                repas.setIdRepas(rs.getInt("idRepas"));
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
    public List<Aliment> selectbyID(int id) {
        PreparedStatement pstmt = null;
        Connection cnx = null;
        ResultSet rs = null;
        try {
            aliments = new ArrayList<>();
            cnx = ConnectionProvider.getConnection();
            pstmt = cnx.prepareStatement(SELECTBYIDALIMENTS);
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            while (rs.next()){
                aliment = new Aliment();
                aliment.setIdAliments(rs.getInt("idAliment"));
                aliment.setNomAliment(rs.getString("nomAliment"));
                aliment.setIdRepas(id);
                aliments.add(aliment);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return aliments;
    }

    @Override
    public int insert(LocalDate date, LocalTime time) {
        PreparedStatement pstmt = null;
        Connection cnx = null;
        ResultSet rs = null;
        int key = 0;

        try {
            cnx = ConnectionProvider.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try{
            pstmt = cnx.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
            java.sql.Date date2 = java.sql.Date.valueOf(LocalDate.of(date.getYear(),date.getMonth(),date.getDayOfMonth()));
            pstmt.setDate(1, date2);
            Time time2 = java.sql.Time.valueOf(LocalTime.of(time.getHour(), time.getMinute()));
            pstmt.setTime(2,time2);
            pstmt.executeUpdate();
            rs  = pstmt.getGeneratedKeys();
            if(rs.next()){
                key = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return key;
    }

    @Override
    public void insertAliment(String nom, int idRepas) {
        PreparedStatement pstmt = null;
        Connection cnx = null;
        ResultSet rs = null;

        try {
            cnx = ConnectionProvider.getConnection();
            pstmt = cnx.prepareStatement(INSERT_ALIMENTS);
            pstmt.setString(1,nom);
            pstmt.setInt(2,idRepas);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
