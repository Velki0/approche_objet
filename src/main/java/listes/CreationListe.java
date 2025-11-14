package listes;

import java.util.ArrayList;

public class CreationListe {

    public static void main(String[] args) {

        // TP11 - Exercice 1
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listeEntiers.add(i);
        }
        System.out.println("La taille de la liste est de : " +  listeEntiers.size());

    }

}
