package chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder chaine = new StringBuilder();
        long debut = System.currentTimeMillis();
        for  (int i = 1; i <= 100000; i++) {
            chaine.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en milisecondes : " + (fin-debut));

        String chaineLente = "";
        debut = System.currentTimeMillis();
        for  (int i = 1; i <= 100000; i++) {
            chaineLente += i;
        }
        fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en milisecondes : " + (fin-debut));

    }

}
