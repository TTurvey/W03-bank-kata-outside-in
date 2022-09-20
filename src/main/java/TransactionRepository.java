import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TransactionRepository {

    final ArrayList<String> transactions = new ArrayList<>();

    void makeTransaction(int amount, int total) {
        String transaction = formatDate() + " || " + amount + "    || " + total;
        transactions.add(transaction);
    }

    String formatDate() {
        Date date = new GregorianCalendar(2012, Calendar.JANUARY, 14).getTime();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}