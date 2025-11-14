package banque.entites;

public class CompteTaux extends Compte {

    private final float tauxRemunerations;

    public CompteTaux(int numeroCompte, int soldeCompte, float tauxRemunerations) {

        super(numeroCompte, soldeCompte);
        this.tauxRemunerations = tauxRemunerations;

    }

    public String toString(){ return super.toString() + " et d'un tauxRemunerations de : " + tauxRemunerations; }

}
