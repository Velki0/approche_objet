package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        // Exercice CalculMoyenne
        CalculMoyenne premiereMoyenne = new CalculMoyenne();
        premiereMoyenne.ajoutNombre(14);
        premiereMoyenne.ajoutNombre(16);
        premiereMoyenne.ajoutNombre(8);
        premiereMoyenne.ajoutNombre(12);
        premiereMoyenne.ajoutNombre(19);
        System.out.println("La premiere moyenne est de : " + premiereMoyenne.calculMoyenne());

        CalculMoyenne secondeMoyenne = new CalculMoyenne();
        secondeMoyenne.ajoutNombre(-900);
        secondeMoyenne.ajoutNombre(16.24);
        secondeMoyenne.ajoutNombre(864);
        secondeMoyenne.ajoutNombre(12/13d);
        secondeMoyenne.ajoutNombre(Math.PI);
        secondeMoyenne.ajoutNombre(230);
        secondeMoyenne.ajoutNombre(0);
        System.out.println("La seconde moyenne est de : " + String.format("%.4f", secondeMoyenne.calculMoyenne()));

    }

}
