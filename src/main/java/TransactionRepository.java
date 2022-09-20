import java.util.ArrayList;

public class TransactionRepository {

    final ArrayList<Transaction> transactionHistory = new ArrayList<>();

    void logTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }

}