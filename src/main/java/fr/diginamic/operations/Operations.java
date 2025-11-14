package fr.diginamic.operations;

public class Operations {

    public static double calcul(int nombreA, int nombreB, char operateur) {

        return switch (operateur) {
            case '+' -> nombreA + nombreB;
            case '-' -> nombreA - nombreB;
            case '*' -> nombreA * nombreB;
            case '/' -> (double) nombreA / nombreB;
            default -> throw new IllegalStateException("Valeur non prise en charge pour : " + operateur);
        };

    }

}
