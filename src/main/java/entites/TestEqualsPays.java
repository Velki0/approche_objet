package entites;

public class TestEqualsPays {

    public static void main(String[] args) {

        //TP10
        Pays premierePays = new Pays("MiniPays", 50_000);
        Pays secondPays = new Pays("MaxiPays", 50_000);

        System.out.println("les deux pays sont-ils identiques ? : " + premierePays.equals(secondPays));

    }
}
