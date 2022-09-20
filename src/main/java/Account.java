import java.util.ArrayList;
import java.util.List;

public class Account {

    private final ArrayList<String> transactions = new ArrayList<>();
    private int total = 0;

    public void deposit(String date, int amount) {
        total += amount;
        String transaction = date + " || " + amount + "    || " + total;
        transactions.add(transaction);
    }

    public void withdraw() {

    }

    public String printStatement() {
        String transactionsString = "";
        for(int i =0; i < transactions.size(); i++ ) {
            transactionsString += "\n" + transactions.get(i);
        }

        return "Date       || Amount || Balance" + transactionsString;
    }

}
