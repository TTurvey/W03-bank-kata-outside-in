import java.util.ArrayList;

public class TransactionRepository {

    final ArrayList<String> transactions = new ArrayList<>();

    void makeTransaction(String date, int amount, int total) {
        String transaction = date + " || " + amount + "    || " + total;
        transactions.add(transaction);
    }
}