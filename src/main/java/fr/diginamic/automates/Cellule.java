package fr.diginamic.automates;

public class Cellule {

    private boolean enVie;
    private boolean prochainEtat;

    public Cellule() {

        aleatoireEnVie();

    }

    public boolean getEnVie() { return enVie; }
    public boolean getProchainEtat() { return prochainEtat; }

    public void setEnVie(boolean enVie) { this.enVie = enVie; }
    public void setProchainEtat(boolean prochainEtat) { this.prochainEtat = prochainEtat; }

    private void aleatoireEnVie() { enVie = (int) (Math.random() * 2) == 1; }

}