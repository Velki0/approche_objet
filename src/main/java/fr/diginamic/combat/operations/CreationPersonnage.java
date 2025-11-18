package fr.diginamic.combat.operations;

import fr.diginamic.combat.entites.Personnage;

import java.util.Scanner;

public abstract class CreationPersonnage {

    public static Personnage creationPersonnage(){

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n" +
                "                      Bienvenue dans le jeu de rôle Chevalier contre Monstres                        \n" +
                "                           Veullier choisir un nom à votre chevalier !                               "
        );
        Personnage personnage = new Personnage(scanner.nextLine());
        personnage.getFichePersonnage();
        return personnage;

    }
}
