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
        Pays autrePays = (Pays) pays;
        return (this.nom.equals((autrePays.nom)) && (this.population == (autrePays.population)));

    }

}
