package geometrie;

public class Rectangle implements ObjetGeometrique {

    private final double longueur;
    private final double largeur;

    public Rectangle(double longueur, double largeur) {

        this.longueur = longueur;
        this.largeur = largeur;

    }

    public double perimetre() { return 2 * longueur + 2 * largeur; }

    public double aire() { return longueur*largeur; }

}
