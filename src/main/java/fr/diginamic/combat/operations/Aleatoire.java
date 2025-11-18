package fr.diginamic.combat.operations;

public abstract class Aleatoire {

    public static int choixAleatoire(int valeurMin, int valeurMax) {

        return (int) (Math.random() * ((valeurMax-valeurMin) + 1)) + valeurMin;

    }

}
