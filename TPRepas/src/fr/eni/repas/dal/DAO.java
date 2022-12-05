package fr.eni.repas.dal;

import java.util.List;

public interface DAO<T> {
    public abstract List<T> selectAll();
    public abstract T selectbyID(int id);
    public abstract void insert(T t);

}
