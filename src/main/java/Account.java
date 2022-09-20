import java.util.ArrayList;

public class Account {

    private final TransactionRepository transactionRepository;
    private final TransactionPrinter transactionPrinter;
    private int total = 0;

    public Account() {
        this.transactionRepository = new TransactionRepository();
        this.transactionPrinter = new TransactionPrinter();
    }

    public void deposit(int amount) {
        total += amount;
        Transaction transaction = new Transaction(amount, total);
        transactionRepository.logTransaction(transaction);
    }

    public void withdraw(int amount) {
        int negativeAmount = -amount;
        total += negativeAmount;
        Transaction transaction = new Transaction(negativeAmount, total);
        transactionRepository.logTransaction(transaction);
    }

    public String printStatement() {
        return transactionPrinter.printStatement(transactionRepository.transactionHistory);
    }

}
