package fr.eni.repas.bo;

public class Aliment {

    int idAliments = 0;
    int idRepas = 0;
    String nomAliment = "";

    public Aliment() {
    }

    public Aliment(String nomAliment) {
        this();
        this.nomAliment = nomAliment;
    }
    public Aliment(String nomAliment, int idRepas) {
        this.nomAliment = nomAliment;
        this.idRepas = idRepas;
    }


    public int getIdAliments() {
        return idAliments;
    }

    public void setIdAliments(int idAliments) {
        this.idAliments = idAliments;
    }


    public String getNomAliment() {
        return nomAliment;
    }

    public void setNomAliment(String nomAliment) {
        this.nomAliment = nomAliment;
    }


    public int getIdRepas() {
        return idRepas;
    }

    public void setIdRepas(int idRepas) {
        this.idRepas = idRepas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aliment{");
        sb.append("idAliments=").append(idAliments);
        sb.append(", nomAliment='").append(nomAliment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
