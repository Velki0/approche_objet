package fr.diginamic.testenumeration;

import listes.Ville;

import java.util.ArrayList;
import java.util.List;

import static fr.diginamic.testenumeration.Continent.*;

public class TestContinentAvecEnum {

    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("New York", (int) (Math.random() * 10000000), AMERIQUE));
        villes.add(new Ville("Paris", (int) (Math.random() * 10000000), EUROPE));
        villes.add(new Ville("Pékin", (int) (Math.random() * 10000000), ASIE));
        villes.add(new Ville("Moscou", (int) (Math.random() * 10000000), EUROPE));
        villes.add(new Ville("Berlin", (int) (Math.random() * 10000000), EUROPE));
        villes.add(new Ville("Sydney", (int) (Math.random() * 10000000), OCEANIE));
        villes.add(new Ville("Sao Paulo", (int) (Math.random() * 10000000), AMERIQUE));
        villes.add(new Ville("Dakar", (int) (Math.random() * 10000000), AFRIQUE));

        for (Ville ville : villes) {
            System.out.println(ville);
        }

    }

}
