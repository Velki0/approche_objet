package maps;

import maps.entites.Pays;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        ArrayList<Pays> listePays = new ArrayList<>();
        listePays.add(new Pays("France", 65_000_000, "Europe"));
        listePays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        listePays.add(new Pays("Belgique", 10_000_000, "Europe"));
        listePays.add(new Pays("Russie", 150_000_000, "Asie"));
        listePays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        listePays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        listePays.add(new Pays("Australie", 20_000_000, "Océanie"));

        HashMap<String, Integer> mapContinent = new HashMap<>();

        for (Pays pays : listePays) {
            if (mapContinent.containsKey(pays.getContinent())) {
                mapContinent.put(pays.getContinent(), mapContinent.get(pays.getContinent()) + 1);
            } else
                mapContinent.put(pays.getContinent(), 1);
        }
        for (String continent : mapContinent.keySet()) {
            System.out.println(continent + " contient " +  mapContinent.get(continent) + " pays renseignés.");
        }

    }

}
