package entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        AdressePostale premiereAdresse = new AdressePostale();
        AdressePostale secondeAdresse = new AdressePostale();
        premiereAdresse.numeroRue = 3;
        premiereAdresse.libelleRue = "rue des lilas";
        premiereAdresse.codePostale = 52340;
        premiereAdresse.ville = "Ageville";
        secondeAdresse.numeroRue = 51;
        secondeAdresse.libelleRue = "rue des tulipes";
        secondeAdresse.codePostale = 31820;
        secondeAdresse.ville = "Pibrac";
    }
}
