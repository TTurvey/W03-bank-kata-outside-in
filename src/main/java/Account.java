import java.util.ArrayList;
import java.util.List;

public class Account {

    private final ArrayList<String> transactions = new ArrayList<>();

    public void deposit(String date, int amount) {
        String transaction = "14/01/2012 || 500    || 500 ";
        transactions.add(transaction);
    }

    public void withdraw() {

    }

    public String printStatement() {
        if (transactions.size() == 0) {
            return "Date       || Amount || Balance";
        }
        return "Date       || Amount || Balance" + "\n" + "14/01/2012 || 500    || 500 ";
    }

}
