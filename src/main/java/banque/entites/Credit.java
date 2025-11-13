package banque.entites;

public class Credit extends Operation {

    public Credit(String dateOperation, float montantOperation) {

        super(dateOperation, montantOperation);

    }

    public String getType() { return "CREDIT"; }

}
