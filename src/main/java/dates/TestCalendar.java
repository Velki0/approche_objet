package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar yaUnMoment = Calendar.getInstance();
        yaUnMoment.set(2016, 4, 19, 23, 59, 30);
        Date yaUnMomentDate = yaUnMoment.getTime();

        Calendar maintenant = Calendar.getInstance();
        Date maintenantDate = maintenant.getTime();

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Y'a un moment : " + formatDate.format(yaUnMomentDate));
        System.out.println("Maintenant : " + formatDate.format(maintenantDate));

        SimpleDateFormat formatDateFR = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.FRANCE);
        Locale Russie = new Locale("ru", "RU");
        SimpleDateFormat formatDateRU = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Russie);
        SimpleDateFormat formatDateCN = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.CHINA);
        SimpleDateFormat formatDateGE = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.GERMANY);
        System.out.println("Maintenant : " + formatDateFR.format(yaUnMomentDate));
        System.out.println("Maintenant : " + formatDateRU.format(yaUnMomentDate));
        System.out.println("Maintenant : " + formatDateCN.format(yaUnMomentDate));
        System.out.println("Maintenant : " + formatDateGE.format(yaUnMomentDate));

    }

}
