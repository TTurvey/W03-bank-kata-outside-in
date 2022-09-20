import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionDate {

    public final Date transactionDate;

    public TransactionDate(){
        this.transactionDate = new Date();
    }

    public String formatTransactionDate() {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(transactionDate);
    }
}
