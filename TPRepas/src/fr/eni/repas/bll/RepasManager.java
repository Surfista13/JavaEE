package fr.eni.repas.bll;

import fr.eni.repas.bo.Repas;
import fr.eni.repas.dal.DAO;
import fr.eni.repas.dal.DAOFactory;

import java.util.ArrayList;
import java.util.List;

public class RepasManager {
    //Déclaration
    private static RepasManager repasManager;
    private DAO <Repas> repasDAO;
    private List<Repas> desRepas = new ArrayList();

    private Repas repas;

    //Constructeur avec instanciation de la DAO et appelle de la méthode select all pour avoir une liste

    public RepasManager() {
        repasDAO = DAOFactory.getRepasDAO();
        desRepas = repasDAO .selectAll();
    }


    //get repasmanager (Singleton)
    public static RepasManager getRepasManager(){
        if(repasManager == null){
            repasManager = new RepasManager();
        }
        return repasManager;
    }

    //Méthode de contrôle des données entrantes dans la BLL (venant du contrôleur)
    //select all
    public List<Repas> findAll() {
        return desRepas;
    }

    //Méthode select par id
    public Repas findID(int id){
        repas = repasDAO.selectbyID(id);
        return null;
    }
    //insert
    public void Add (Repas repas){
        repasDAO.insert(repas);
    }



}
