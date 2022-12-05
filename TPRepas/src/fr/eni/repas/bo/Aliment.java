package fr.eni.repas.bo;

public class Aliment {

    int idAliments = 0;
    String nomAliment = "";
    Repas repas;

    public Aliment() {
        repas.ajoutAliment(this);
    }

    public Aliment(String nomAliment) {
        this();
        this.nomAliment = nomAliment;
    }

    public Aliment(String nomAliment, Repas repas) {
        this.nomAliment = nomAliment;
        this.repas = repas;
        repas.ajoutAliment(this);
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

    public Repas getRepas() {
        return repas;
    }

    public void setRepas(Repas repas) {
        this.repas = repas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aliment{");
        sb.append("idAliments=").append(idAliments);
        sb.append(", nomAliment='").append(nomAliment).append('\'');
        sb.append(", repas=").append(repas);
        sb.append('}');
        return sb.toString();
    }
}
