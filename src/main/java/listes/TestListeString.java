package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

    public static void main(String[] args) {

        //TP11 - Exercice 4
        ArrayList<String> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        // Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
        String plusGrandNomDeVille = listeVilles.getFirst();
        for (String ville: listeVilles) {
            if(ville.length() > plusGrandNomDeVille.length()) {
                plusGrandNomDeVille = ville;
            }
        }
        System.out.println("La ville possèdant le plus de lettre est : " + plusGrandNomDeVille + ".");

        // Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
        listeVilles.replaceAll(String::toUpperCase);

        // Supprimez de la liste les villes dont le nom commence par la lettre N
        listeVilles.removeIf(ville -> ville.substring(0, 1).equals("N"));
        // Peut être résalisé de façon lourde :
      /*
        Iterator<String> iterateur = listeVilles.iterator();
        while (iterateur.hasNext()) {
            String ville = iterateur.next();
            if (ville.substring(0, 1).equals("N")) {
                iterateur.remove();
            }
        }
      */

        // Affichez la liste résultante
        System.out.println("La liste résultante contient : ");
        for (String ville : listeVilles) {
            System.out.print(ville + " ");
        }
        System.out.print("\n");

    }
}
