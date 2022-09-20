public class Account {

    private final TransactionRepository transactionRepository = new TransactionRepository();
    private final TransactionPrinter transactionPrinter = new TransactionPrinter();
    private int total = 0;

    public void deposit(int amount) {
        total += amount;
        transactionRepository.makeTransaction(amount, total);
    }

    public void withdraw(int amount) {
        int negativeAmount = -amount;
        total += negativeAmount;
        transactionRepository.makeTransaction(negativeAmount, total);
    }

    public String printStatement() {
        return transactionPrinter.printStatement(transactionRepository.transactions);
    }

}
