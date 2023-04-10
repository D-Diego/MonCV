package com.example.mon_cv_app;

public class Projet {
    private String NomProjet;
    private String LienProjet;
    private String DescriptionProjet;

    public Projet(String nomProjet, String lienProjet, String descriptionProjet) {
        NomProjet = nomProjet;
        LienProjet = lienProjet;
        DescriptionProjet = descriptionProjet;
    }

    public String getNomProjet() {
        return NomProjet;
    }

    public void setNomProjet(String nomProjet) {
        NomProjet = nomProjet;
    }

    public String getLienProjet() {
        return LienProjet;
    }

    public void setLienProjet(String lienProjet) {
        LienProjet = lienProjet;
    }

    public String getDescriptionProjet() {
        return DescriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        DescriptionProjet = descriptionProjet;
    }

}
