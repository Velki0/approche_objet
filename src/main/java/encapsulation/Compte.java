package encapsulation;

public class Compte {

    private int numeroCompte;
    private int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte() { return numeroCompte; }
    public int getSoldeCompte() { return soldeCompte; }

    public void setNumeroCompte(int numeroCompte) { this.numeroCompte = numeroCompte; }
    public void setSoldeCompte(int soldeCompte) {this.soldeCompte = soldeCompte; }

}
