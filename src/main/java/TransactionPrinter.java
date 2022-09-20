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
                + formatDateTime(transaction)
                + " || "
                + transaction.amount
                + "    || "
                + transaction.total;
        return transactionString;
    }

    public String formatDateTime(Transaction transaction) {
//        transaction.dateTime
        Date date = new GregorianCalendar(2012, Calendar.JANUARY, 14).getTime();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
