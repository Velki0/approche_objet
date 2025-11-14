package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        // Exercice Immobilier
        Maison maMaison = new Maison();
        maMaison.ajouterPiece(new Salon(28.3, 0));
        maMaison.ajouterPiece(new Cuisine(15.8, 0));
        maMaison.ajouterPiece(new Chambre(19.4, 1));
        maMaison.ajouterPiece(new Chambre(21.1, 1));
        maMaison.ajouterPiece(new Chambre(15.2, 2));
        maMaison.ajouterPiece(new SalleDeBain(12.5, 0));
        maMaison.ajouterPiece(new SalleDeBain(13.2, 1));
        maMaison.ajouterPiece(new WC(3.8, 0));
        maMaison.ajouterPiece(new WC(4.2, 1));
        System.out.println("La superficie totale de ma maison est de : " + maMaison.getSuperficieTotale());
        System.out.println("La supericie de l'étage 1 de ma maison est de : " + String.format("%.2f", maMaison.getSuperficieEtage(1)));

        // Test null
        maMaison.ajouterPiece(null);
        maMaison.ajouterPiece(new Chambre(-18.5, 0));
        maMaison.ajouterPiece(new WC(8.5, -50));

        System.out.println("La superficie totale des chambres est de : " +  String.format("%.2f", maMaison.getSuperficieTotaleTypePiece(Chambre.class)) + ".");

        System.out.println("Dans la maison, il y a : " + maMaison.getNombreTypePiece(Chambre.class) + " Chambres.");

    }
}
