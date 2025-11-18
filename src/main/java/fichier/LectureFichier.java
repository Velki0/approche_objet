package fichier;

import fichier.tri.ComparatorHabitant;
import fichier.tri.ComparatorNom;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LectureFichier {

    public static void main(String[] args) throws IOException {

        // TP12
        String chemin = "C:/Users/agent/Desktop/Diginamic/14 - Langage Java - Approche objet/ProjetsJava/approche_objet/src/main/resources/";

        Path path = Paths.get(chemin +"recensement.csv");
        List<String> recensement = Files.readAllLines(path, StandardCharsets.UTF_8);

        // Exercice LireFichier
//        for (String ligne : recensement) {
//            System.out.println(ligne);
//        }

        // Exercice LireFichierAvecInstanciation
        List<Ville> listeVille = new ArrayList<>();
        String[] token;
        for (int index = 1; index < recensement.size(); index++) {
            token = recensement.get(index).split(";");
            listeVille.add(new Ville(token[6], token[2], token[1], Integer.parseInt(token[9].trim().replaceAll("\\s+",""))));
        }
        System.out.println("Liste de ville créée avec : " + listeVille.toArray().length + " entrées.");

        // Exercice GenererFichier
        boolean supprime = Files.deleteIfExists(Paths.get(chemin + "grandesVilles.csv"));
        if (supprime) { System.out.println("File deleted."); }
        File grandesVilles = new File(chemin + "grandesVilles.csv");
        boolean succes = grandesVilles.createNewFile();
        if (succes) { System.out.println("File created."); }

        Path secondPath = Paths.get(chemin + "grandesVilles.csv");
        Files.writeString(secondPath, "Nom;Code département;Nom de la région;Population Totale" + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        for (Ville ville : listeVille) {
            if (ville.getPopulationTotal() >= 25000) {
                Files.writeString(secondPath, ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotal() + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        }

        //TP13
        // Exercice 1 et 2
        Collections.sort(listeVille);
        System.out.println("Voici la liste des villes dans l'ordre croissant suivant le compareto() : ");
        for (Ville ville : listeVille) {
            System.out.println(ville.getNom() + " " + ville.getPopulationTotal());
        }

        // Exercice 3
        List<Ville> listeGrandesVilles = new ArrayList<>();
        for (Ville ville : listeVille) {
            if (ville.getPopulationTotal() >= 25000) {
                listeGrandesVilles.add(ville);
            }
        }
        Collections.sort(listeGrandesVilles,  Collections.reverseOrder());
        System.out.println("Voici la liste des grandes villes dans l'ordre décroissant suivant le compareto() : ");
        for (Ville ville : listeGrandesVilles) {
            System.out.println(ville.getNom() + " " + ville.getPopulationTotal());
        }

        //Exercice 4
        Collections.sort(listeGrandesVilles, Collections.reverseOrder(new ComparatorHabitant()));
        System.out.println("Voici la liste des grandes villes dans l'ordre décroissant suivant le ComparatorHabitant : ");
        for (Ville ville : listeGrandesVilles) {
            System.out.println(ville.getNom() + " " + ville.getPopulationTotal());
        }
        Collections.sort(listeGrandesVilles, new ComparatorNom());
        System.out.println("Voici la liste des grandes villes dans l'ordre croissant suivant le ComparatorNom : ");
        for (Ville ville : listeGrandesVilles) {
            System.out.println(ville.getNom() + " " + ville.getPopulationTotal());
        }

    }

}
