import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {

    public final Date dateTime;
    public int amount;
    public int total;

    public Transaction(int amount, int total) {
        this.dateTime = new Date();
        this.amount = amount;
        this.total = total;
    }

}
