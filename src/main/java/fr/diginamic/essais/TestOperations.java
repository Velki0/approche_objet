package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {

        // Exercice Operations
        int nombreA = 20;
        int nombreB = 0;

        // +
        System.out.println("Addition de A + B : " + Operations.calcul(nombreA, nombreB, '+'));
        // -
        System.out.println("Soustraction de A + B : " + Operations.calcul(nombreA, nombreB, '-'));
        // Multiplication
        System.out.println("Multiplication de A + B : " + Operations.calcul(nombreA, nombreB, '*'));
        // Division
        System.out.println("Division de A + B : " + Operations.calcul(nombreA, nombreB, '/'));
        // Test n'importe quoi
        // System.out.println("????? de A + B : " + Operations.calcul(nombreA, nombreB, '%'));

    }
}
