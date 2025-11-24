package fr.diginamic.testenumeration;

import java.util.Objects;

public class TestEnumeration {

    public static void main(String[] args) {

        // Exercice 1
        for(Saison saison : Saison.values()){
            System.out.println(saison);
        }

        String nom = "ETE" ;
        System.out.println(Saison.valueOf(nom).getLibelleSaison());

        System.out.println(("Test de la méthode retournerSaison : " + Objects.requireNonNull(Saison.getSaison("Hiver"))));

    }

}
