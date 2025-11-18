package entites;

public class Pays {

    private final String nom;
    private final int population;

    public Pays(String nom, int population) {

        this.nom = nom;
        this.population = population;

    }

    public boolean equals(Pays pays) {

        if (!(pays instanceof Pays)) {
            return false;
        }
        return this.nom.equals(((Pays) pays).nom);

    }

}
