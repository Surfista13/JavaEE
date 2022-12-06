package fr.eni.repas.dal;

import fr.eni.repas.bo.Aliment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface DAO<T> {
    public abstract List<T> selectAll();
    public abstract List<Aliment> selectbyID(int id);
    public abstract int insert(LocalDate date, LocalTime time);
    public abstract void insertAliment(String nom,int idRepas);

}
