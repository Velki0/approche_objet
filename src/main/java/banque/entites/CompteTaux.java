package banque.entites;

public class CompteTaux extends Compte {

    private float tauxRemunerations;

    public CompteTaux(int numeroCompte, int soldeCompte, float tauxRemunerations) {

        super(numeroCompte, soldeCompte);
        this.tauxRemunerations = tauxRemunerations;

    }

    public String toString(){ return super.toString() + " et d'un tauxRemunerations de : " + tauxRemunerations; }

}
