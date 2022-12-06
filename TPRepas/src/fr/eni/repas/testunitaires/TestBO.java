package fr.eni.repas.testunitaires;

import fr.eni.repas.bo.Aliment;
import fr.eni.repas.bo.Repas;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestBO {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        LocalTime t1 = LocalTime.now();
        Repas r1 = new Repas(1,d1,t1);
        System.out.println(r1);
        Aliment a1 = new Aliment("Carotte",1);
        System.out.println(a1);
        System.out.println(r1);
    }
}
