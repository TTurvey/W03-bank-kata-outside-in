public class Transaction {

    public final TransactionDate transactionDate;
    public int amount;
    public int total;

    public Transaction(int amount, int total) {
        this.transactionDate = new TransactionDate();
        this.amount = amount;
        this.total = total;
    }

}
