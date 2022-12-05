package fr.eni.repas.dal;

import fr.eni.repas.bo.Aliment;

public abstract class DAOFactory {

    public static RepasDAOImplSQLServer getRepasDAO(){
        return new RepasDAOImplSQLServer();
    }


    public static DAO<Aliment> getAlimentDAO() {
        return new AlimentDAOImplSQLServer();
    }
}
