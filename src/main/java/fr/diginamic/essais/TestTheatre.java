package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        // Exercice Theatre
        Theatre theatreGalloRomain = new Theatre("Théâtre Gallo Romain", 800);
        theatreGalloRomain.inscrire(50, 20.50);
        theatreGalloRomain.inscrire(242, 19.55);
        theatreGalloRomain.inscrire(115, 21.20);
        theatreGalloRomain.inscrire(302, 18.99);
        theatreGalloRomain.inscrire(120, 20.85);
        System.out.println("Le " + theatreGalloRomain.getNom() +
                " possède un total de : " + theatreGalloRomain.getTotalClientsInscrits() +
                " clients inscrits pour une recette totale de : " + theatreGalloRomain.getRecetteTotale() + " €.");

    }

}
