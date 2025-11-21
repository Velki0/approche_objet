package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {

    public static void main(String[] args) {

        // Exercice 4
        HashMap<Integer, Ville> mapVilles = new HashMap<>();
        mapVilles.put(1, new Ville("Nice", 343_000));
        mapVilles.put(2, new Ville("Carcassonne", 47_800));
        mapVilles.put(3, new Ville("Narbonne", 53_400));
        mapVilles.put(4, new Ville("Lyon", 484_000));
        mapVilles.put(5, new Ville("Foix", 9_700));
        mapVilles.put(6, new Ville("Pau", 77_200));
        mapVilles.put(7, new Ville("Marseille", 850_700));
        mapVilles.put(8, new Ville("Tarbes", 40_600));

        int indexVilleMoinsPeuplee = 1;
        for (Integer clef : mapVilles.keySet()) {
            if (mapVilles.get(indexVilleMoinsPeuplee).getPopulation() > (mapVilles.get(clef).getPopulation())) {
                indexVilleMoinsPeuplee = clef;
            }
        }
        mapVilles.remove(indexVilleMoinsPeuplee);
        for (Integer clef : mapVilles.keySet()) {
            System.out.println("Ville : " + mapVilles.get(clef).getNom() + ", Population : " + mapVilles.get(clef).getPopulation());
        }

    }

}
