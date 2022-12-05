package fr.eni.repas.dal;

import fr.eni.repas.bo.Repas;

import java.util.List;

public class RepasDAOImplSQLServer implements DAO<Repas> {

    //Déclaration requêtes
    private static final  String SELECTALL = "SELECT * FROM repas;";
    private static final String SELECTBYID = "SELECT * FROM repas WHERE idAliment = ?;";
    private static final String INSERT = "INSERT INTO repas (dateRepas,heureRepas) VALUES (?,?)";

    @Override
    public List<Repas> selectAll() {
        return null;
    }

    @Override
    public Repas selectbyID(int id) {
        return null;
    }

    @Override
    public void insert(Repas repas) {

    }
}
