package fr.eni.repas.bo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Repas {
    LocalDate date;
    LocalTime time;

    List<Aliment> aliments;

    public Repas() {
        aliments = new ArrayList<Aliment>();
    }

    public Repas(LocalDate date, LocalTime time) {
        this();
        this.date = date;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<Aliment> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliment> aliments) {
        this.aliments = aliments;
    }
    public void ajoutAliment(Aliment aliment) {
        aliments.add(aliment);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Repas{");
        sb.append("date=").append(date);
        sb.append(", time=").append(time);
        sb.append(", aliments=").append(aliments);
        sb.append('}');
        return sb.toString();
    }
}
