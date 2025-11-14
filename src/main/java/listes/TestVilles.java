package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVilles {

    public static void main(String[] args) {

        // TP11 - Exercice 5
        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Nice", 343_000));
        listeVilles.add(new Ville("Carcassonne", 47_800));
        listeVilles.add(new Ville("Narbonne", 53_400));
        listeVilles.add(new Ville("Lyon", 484_000));
        listeVilles.add(new Ville("Foix", 9_700));
        listeVilles.add(new Ville("Pau", 77_200));
        listeVilles.add(new Ville("Marseille", 850_700));
        listeVilles.add(new Ville("Tarbes", 40_600));

        // Rechercher la ville la plus peuplée
        Ville villeLaPlusPeuplee = listeVilles.getFirst();
        for (Ville ville : listeVilles) {
            if (ville.getPopulation() > villeLaPlusPeuplee.getPopulation()) {
                villeLaPlusPeuplee = ville;
            }
        }
        System.out.println("La ville la plus peuplée est : " + villeLaPlusPeuplee.getNom());

        // Supprimez la ville la moins peuplée
        Ville villeLaMoinsPeuplee = listeVilles.getFirst();
        for (Ville ville : listeVilles) {
            if (ville.getPopulation() < villeLaMoinsPeuplee.getPopulation()) {
                villeLaMoinsPeuplee = ville;
            }
        }
        Iterator<Ville> iterateur = listeVilles.iterator();
        while (iterateur.hasNext()) {
            Ville ville = iterateur.next();
            if (ville.getNom().equals(villeLaMoinsPeuplee.getNom())) {
                iterateur.remove();
            }
        }

        // Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
        for (Ville listeVille : listeVilles) {
            if (listeVille.getPopulation() > 100_000) {
                listeVille.setNom(listeVille.getNom().toUpperCase());
            }
        }

        // Affichez la liste résultante
        System.out.print("La liste résultante contient : ");
        for (Ville ville : listeVilles) {
            System.out.print(ville.getNom() + " et ses " +  ville.getPopulation() + " hab. ");
        }
        System.out.print("\n");

    }
}
