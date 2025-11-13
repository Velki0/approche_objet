package banque.entites;

public class TestBanque {

    public static void main(String[] args) {

        Compte compteDeJean = new Compte(2546215, 5000);
        compteDeJean.setNumeroCompte(1234567);
        compteDeJean.setSoldeCompte(20000);
        System.out.println("Numéro de compte de Jean: " + compteDeJean.getNumeroCompte());
        System.out.println("Solde du compte de Jean: " + compteDeJean.getSoldeCompte());

        System.out.println(compteDeJean);

    }
}
