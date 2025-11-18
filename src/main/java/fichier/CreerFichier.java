package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:/Users/agent/Desktop/Diginamic/14 - Langage Java - Approche objet/TP/recensement.csv");
        List<String> lignesRecensementTotal = Files.readAllLines(path, StandardCharsets.UTF_8);
        List<String> centPremiereLigne = new ArrayList<>();

        for (int index = 0; index < 100; index++) {
            centPremiereLigne.add(lignesRecensementTotal.get(index));
            System.out.println(centPremiereLigne.get(index));
        }

    }

}
