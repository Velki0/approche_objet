package gson;

import listes.Ville;
import com.google.gson.Gson;

public class TranformeVilleEnJson {

    public static void main(String[] args) {

        Gson gson = new Gson();
        // Objet
        Ville ville = new Ville("Marseille", 834000);

        // Transformation en Json
        String json = gson.toJson(ville);

        System.out.println(json);

    }

}
