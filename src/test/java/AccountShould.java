import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AccountShould {

    private final String headings = "Date       || Amount || Balance";
    private String transactionDate = new TransactionDate().formatTransactionDate();

    @Test
    void
    print_statement_returns_transactions() {
        assertEquals(headings, new Account().printStatement() );
    }

    @ParameterizedTest
    @CsvSource({
            "500, 500",
            "100, 100"
    })
    void deposit_made_and_print_statement (int amount, int total) {
        Account account = new Account();
        account.deposit(amount);
        String expectedPrintStatement = headings + "\n" + transactionDate + " || " + amount + "    || " + total;
        assertEquals( expectedPrintStatement, account.printStatement() );
    }


    @Test
    void
    deposit_more_than_once_and_print_transaction() {
        int amount1 = 500;
        int amount2 = 1000;
        Account account = new Account();
        account.deposit(amount1);
        account.deposit(amount2);

        String expectedPrintStatement = headings
                + "\n" + transactionDate + " || 500    || 500"
                + "\n" + transactionDate + " || 1000    || 1500";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

    @ParameterizedTest
    @CsvSource({
            "500, -500",
            "100, -100"
    })
    void withdrawal_made_and_print_statement (int amount, int total) {
        Account account = new Account();
        account.withdraw(amount);
        String expectedPrintStatement = headings + "\n" + transactionDate + " || " + -amount + "    || " + total;
        assertEquals( expectedPrintStatement, account.printStatement() );
    }

    @Test
    void
    deposit_and_withdraw_more_than_once_and_print_transaction() {
        int amount1 = 500;
        int amount2 = 1000;
        int amount3 = 1200;
        int amount4 = 10;
        Account account = new Account();
        account.deposit(amount1);
        account.deposit(amount2);
        account.withdraw(amount3);
        account.withdraw(amount4);

        String expectedPrintStatement = headings
                + "\n" + transactionDate + " || 500    || 500"
                + "\n" + transactionDate + " || 1000    || 1500"
                + "\n" + transactionDate + " || -1200    || 300"
                + "\n" + transactionDate + " || -10    || 290";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

}

// TO DO:
// Account class implements AccountService interface...

