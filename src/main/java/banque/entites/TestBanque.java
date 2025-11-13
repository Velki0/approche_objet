package banque.entites;

public class TestBanque {

    public static void main(String[] args) {

        // TP05
        Compte compteDeJean = new Compte(2546215, 5000);
        compteDeJean.setNumeroCompte(1234567);
        compteDeJean.setSoldeCompte(20000);
        System.out.println("Numéro de compte de Jean: " + compteDeJean.getNumeroCompte());
        System.out.println("Solde du compte de Jean: " + compteDeJean.getSoldeCompte());

        // TP06
        System.out.println(compteDeJean);

        // TP07
        CompteTaux compteDeMarie = new CompteTaux(7654321, 8000, 1.6f);
        Compte[] tableauCompte = new Compte[2];
        tableauCompte[0] = compteDeJean;
        tableauCompte[1] = compteDeMarie;
        for (Compte compte : tableauCompte) {
            System.out.println(compte);
        }

    }
}
