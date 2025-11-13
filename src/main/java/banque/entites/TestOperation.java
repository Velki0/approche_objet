package banque.entites;

import java.util.Objects;

public class TestOperation {

    public static void main(String[] args) {

        // TP08
        Operation premiereOperation = new Credit("03/08/2025", 3000);
        Operation deuxiemeOperation = new Debit("04/08/2025", 4020.22f);
        Operation troisiemeOperation = new Debit("05/08/2025", 50.10f);
        Operation quatriemeOperation = new Credit("06/08/2025", 1234.56f);
        Operation[] tableauOperations = new Operation[4];
        tableauOperations[0] = premiereOperation;
        tableauOperations[1] = deuxiemeOperation;
        tableauOperations[2] = troisiemeOperation;
        tableauOperations[3] = quatriemeOperation;

        float totalOperation = 0;
        for (Operation operation : tableauOperations) {
            System.out.println(
                    "L'opération datant du : "
                    + operation.getDateOperation() + " pour une action de : "
                    + operation.getType() + " est d'une valeur de : "
                    + operation.getMontantOperation());
            if (Objects.equals(operation.getType(), "CREDIT")) {
                totalOperation += operation.getMontantOperation();
            }
            if (Objects.equals(operation.getType(), "DEBIT")) {
                totalOperation -= operation.getMontantOperation();
            }
        }
        System.out.println("Le total des opérations est de : " + String.format("%.2f", totalOperation));

    }
}
