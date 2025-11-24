package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville {

    private String nom;
    private int population;
    private Continent continent;

    public Ville(String nom, int population) {

        this.nom = nom;
        this.population = population;

    }

    public Ville(String nom, int population, Continent continent) {

        this.nom = nom;
        this.population = population;
        this.continent = continent;

    }

    public String getNom() { return nom; }
    public int getPopulation() { return population; }
    public Continent getContinent() { return continent; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPopulation(int population) { this.population = population; }
    public void setContinent(Continent continent) { this.continent = continent; }

    @Override
    public String toString() {
        return nom + ", " + population + ", " + continent.getLibelle();
    }

}
