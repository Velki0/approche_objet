package fichier;

public class Ville {

    private final String nom;
    private final String codeDepartement;
    private final String nomRegion;
    private final int populationTotal;

    public Ville(String nom, String codeDepartement, String nomRegion, int populationTotal) {

        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotal = populationTotal;

    }

    public String getNom() { return nom; }
    public String getCodeDepartement() { return codeDepartement; }
    public String getNomRegion() { return nomRegion; }
    public int getPopulationTotal() { return populationTotal; }

}
