package fr.eni.repas.bll;

import fr.eni.repas.bo.Aliment;
import fr.eni.repas.bo.Repas;
import fr.eni.repas.dal.DAO;
import fr.eni.repas.dal.DAOFactory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RepasManager {
    //Déclaration
    private static RepasManager repasManager;
    private DAO <Repas> repasDAO;
    private List<Repas> desRepas = new ArrayList();
    private List<Aliment> aliments = new ArrayList<>();

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
    public List<Aliment> findID(int id){
        aliments = repasDAO.selectbyID(id);
        return aliments;
    }

    //insert
    public int Add (LocalDate date, LocalTime time){
        int id = repasDAO.insert(date,time);
        return id;
    }

    public void AddAliments (String nom,int idRepas){
        repasDAO.insertAliment(nom,idRepas);
    }
}
