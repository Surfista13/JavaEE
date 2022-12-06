package fr.eni.repas.bll;

import fr.eni.repas.bo.Aliment;
import fr.eni.repas.dal.DAO;
import fr.eni.repas.dal.DAOFactory;

import java.util.ArrayList;
import java.util.List;

public class AlimentManager {

    private static AlimentManager alimentManager;
    private DAO<Aliment> daoAliment;
    private List<Aliment> aliments = new ArrayList<>();


    //Constructeur qui instancie ma DAO et DAO factory
    public AlimentManager() {
        daoAliment = DAOFactory.getAlimentDAO();
        aliments = daoAliment.selectAll();
    }

    //Singleton
    public AlimentManager getAlimentManager() {
        if (alimentManager == null) {
            alimentManager = new AlimentManager();
        }
        return alimentManager;
    }
}
    //Méthode select all

