package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        Personne premierePersonne = new Personne();
        Personne secondePersonne = new Personne();

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

        premierePersonne.nom = "Blanc";
        premierePersonne.prenom = "Michel";
        premierePersonne.adressePostale = premiereAdresse;
        secondePersonne.nom = "Mustermann";
        secondePersonne.prenom = "Fabien";
        secondePersonne.adressePostale = secondeAdresse;
    }
}
