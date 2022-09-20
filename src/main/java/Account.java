public class Account {

    private final TransactionRepository transactionRepository = new TransactionRepository();
    private final TransactionPrinter transactionPrinter = new TransactionPrinter();
    private int total = 0;

    public void deposit(String date, int amount) {
        total += amount;
        transactionRepository.makeTransaction(date, amount, total);
    }

    public void withdraw(String date, int amount) {
        int negativeAmount = -amount;
        total += negativeAmount;
        transactionRepository.makeTransaction(date, negativeAmount, total);
    }

    public String printStatement() {
        return transactionPrinter.printStatement(transactionRepository.transactions);
    }

}
