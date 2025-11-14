package geometrie;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        //TP09
        Cercle unCercle = new Cercle(5.2);
        Rectangle unRectangle = new Rectangle(50, 3);
        ObjetGeometrique[] tableauObjets = new ObjetGeometrique[2];
        tableauObjets[0] = unCercle;
        tableauObjets[1] = unRectangle;

        for (ObjetGeometrique objet : tableauObjets) {
            System.out.println(
                "L'objet possède un périmètre de : " + String.format("%.2f", objet.perimetre()) +
                " et une aire de : " + String.format("%.2f", objet.aire())
            );
        }

    }
}
