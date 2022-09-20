import java.util.ArrayList;

public class TransactionPrinter {
    Console console;

    public TransactionPrinter(Console console) {
        this.console = console;
    }

    public TransactionPrinter() {
        this.console = new Console();
    }

    public String printStatement(ArrayList<Transaction> transactionHistory) {
        String headings = "Date       || Amount || Balance";
        String transactionHistoryString = "";
        for (Transaction transaction : transactionHistory) {
            transactionHistoryString += formatTransaction(transaction);
        }

        String output = headings + transactionHistoryString;
        console.printsToConsole(output);
        return output; // fake
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

// make Console class
// change String returns to void
// clock
// argument captor

