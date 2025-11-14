package fr.diginamic.maison;

public abstract class Piece {

    private final double superficie;
    private final int numeroEtage;

    public Piece(double superficie, int numeroEtage) {

        this.superficie = superficie;
        this.numeroEtage = numeroEtage;

    }

    public double getSuperficie() { return superficie; }
    public int getNumeroEtage() { return numeroEtage; }

}
