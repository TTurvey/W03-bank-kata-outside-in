import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AccountShould {

    private final String headings = "Date       || Amount || Balance";
    private String getTodaysDate() {
        Date today = new Date();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        return simpleDateFormat.format(today);
    }

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
        String expectedPrintStatement = headings + "\n" + getTodaysDate() + " || " + amount + "    || " + total;
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
                + "\n" + getTodaysDate() + " || 500    || 500"
                + "\n" + getTodaysDate() + " || 1000    || 1500";

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
        String expectedPrintStatement = headings + "\n" + getTodaysDate() + " || " + -amount + "    || " + total;
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
                + "\n" + getTodaysDate() + " || 500    || 500"
                + "\n" + getTodaysDate() + " || 1000    || 1500"
                + "\n" + getTodaysDate() + " || -1200    || 300"
                + "\n" + getTodaysDate() + " || -10    || 290";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

}

// TO DO:
// Create date/calendar class - mock the date we want in the tests.
// Account class implements AccountService interface...

