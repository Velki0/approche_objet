package entites;

public class Pays {

    private final String nom;
    private final int population;

    public Pays(String nom, int population) {

        this.nom = nom;
        this.population = population;

    }

    public boolean equals(Pays pays) {

        return this.nom.equals(pays.nom) && this.population == pays.population;

    }

}
