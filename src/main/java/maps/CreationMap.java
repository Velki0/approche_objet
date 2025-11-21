package maps;

import java.util.HashMap;

public class CreationMap {

    public static void main(String[] args) {

        // Exercice 1
        HashMap<String, Integer> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);
        System.out.println("Taille de la map : " + mapSalaires.size());

        // Exercice 2
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(69, "Lyon");
        mapVilles.put(59, "Lille");
        mapVilles.put(33, "Bordeaux");
        for (Integer departement : mapVilles.keySet()) {
            System.out.println(departement);
        }
        for (Integer departement : mapVilles.keySet()) {
            System.out.println(mapVilles.get(departement));
        }
        System.out.println("Taille de la map : " + mapVilles.size());

        // Exercice 3
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
        HashMap<Integer, String> map3 = new HashMap<>();
        for (Integer index : map1.keySet()) {
            map3.put(index, map1.get(index));
        }
        for (Integer index : map2.keySet()) {
            map3.put(index, map2.get(index));
        }

    }

}
