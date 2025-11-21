package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        Date maintenant = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Maintenant : " + formatDate.format(maintenant));

        Date bienAvant = new Date(116, 4, 9, 23, 59, 30);
        SimpleDateFormat formatDateDeux = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Bien avant : " + formatDateDeux.format(bienAvant));
        System.out.println("Maintenant : " + formatDateDeux.format(maintenant));

    }

}
