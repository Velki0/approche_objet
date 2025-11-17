package fr.diginamic.combat.entites;

public class AmeliorationAttaque {

    private final int effetAttaque;
    private int duree;

    public AmeliorationAttaque(int effetAttaque, int duree) {

        this.effetAttaque = effetAttaque;
        this.duree = duree;

    }

    public int getEffet() { return effetAttaque; }
    public int getDuree() { return duree; }

    public void setDuree(int duree) { this.duree = duree; }
}
