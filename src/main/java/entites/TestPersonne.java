package entites;

public class TestPersonne {

    public static void main(String[] args) {

        AdressePostale premiereAdresse = new AdressePostale(3, "rue des lilas", 52340, "Ageville");
        AdressePostale secondeAdresse = new AdressePostale(51, "rue des tulipes", 31820, "Pibrac");

        Personne premierePersonne = new Personne("Blanc", "Michel", premiereAdresse);
        premierePersonne.afficherPersonne();

        Personne secondePersonne = new Personne("Mustermann", "Fabien");
        secondePersonne.setAdressePostale(secondeAdresse);
        secondePersonne.afficherPersonne();
        System.out.println(secondePersonne.adressePostale.codePostale);

    }
}
