import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TransactionPrinter {
    public String printStatement(ArrayList<Transaction> transactionHistory) {
        String headings = "Date       || Amount || Balance";
        String transactionHistoryString = "";
        for (Transaction transaction : transactionHistory) {
            transactionHistoryString += formatTransaction(transaction);
        }

        return  headings + transactionHistoryString;
    }

    public String formatTransaction(Transaction transaction) {
        String transactionString = "";
        transactionString += "\n"
                + transaction.transactionDate.formatTransactionDate()
                + " || "
                + transaction.amount
                + "    || "
                + transaction.total;
        return transactionString;
    }


}
