package listes;

import java.util.*;

public class TestListInt {

    public static void main(String[] args) {

        //TP11 - Exercice 3
        ArrayList<Integer> listeEntiers = new ArrayList<>();
        Collections.addAll(listeEntiers, -1, 5, 7, 3, -2, 4, 8, 5);

        // Affichez tous les éléments de la liste
        System.out.print("La liste contient : ");
        for (Integer integer : listeEntiers) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

        // Affichez la taille de la liste
        System.out.println("La liste contient " +  listeEntiers.size() + " éléments");

        // Recherchez et affichez le plus grand élément de la liste
        int maxEntier = listeEntiers.getFirst();
        for (Integer integer : listeEntiers) {
            if (integer > maxEntier) {
                maxEntier = integer;
            }
        }
        System.out.println("Le max de la liste est : " + maxEntier);

        // Supprimez le plus petit élément de la liste et affichez le résultat
        Iterator<Integer> iterateur = listeEntiers.iterator();
        while (iterateur.hasNext()) {
            Integer entier = iterateur.next();
            if (entier.equals(Collections.min(listeEntiers))) {
                iterateur.remove();
            }
        }
        System.out.println("La liste contient : ");
        for (Integer integer : listeEntiers) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

        // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent positifs.
        for (int index = 0; index < listeEntiers.size(); index++) {
            if (listeEntiers.get(index)< 0) {
                listeEntiers.set(index, -listeEntiers.get(index));
            }
        }

        // Affichez enfin la liste résultante
        System.out.println("La liste résultante contient : ");
        for (Integer integer : listeEntiers) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

    }

}
