package geometrie;

public class Cercle implements ObjetGeometrique {

    private final double rayon;

    public Cercle(double rayon) {

        this.rayon = rayon;

    }

    public double perimetre() { return rayon*2*Math.PI; }

    public double aire() { return rayon*rayon*Math.PI; }

}
