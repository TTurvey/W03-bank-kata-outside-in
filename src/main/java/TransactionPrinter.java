import java.time.LocalDate;
import java.util.ArrayList;

public class TransactionPrinter {
    public String printStatement(ArrayList<String> transactionHistory) {
        String transactionsString = "";
        for (String transaction : transactionHistory) {
            transactionsString += "\n" + transaction;
        }

        return "Date       || Amount || Balance" + transactionsString;
    }
}
