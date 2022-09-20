import java.time.LocalDateTime;

public class Transaction {

    public final LocalDateTime dateTime;
    public int amount;
    public int total;

    public Transaction(int amount, int total) {
        this.dateTime = LocalDateTime.now();
        this.amount = amount;
        this.total = total;
    }

}
