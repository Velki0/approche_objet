package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps"),
    ETE("Été"),
    AUTOMNE("Automne"),
    HIVER("Hiver");

    private final String libelleSaison;
    private int ordre;

    Saison(String libelleSaison) {

        this.libelleSaison = libelleSaison;

    }

    public String getLibelleSaison() {
        return libelleSaison;
    }

    public static Saison getSaison(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.getLibelleSaison().equals(libelle)) {
                return saison;
            }
        }
        return null;
    }

}

