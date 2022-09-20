import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountShould {

    @Test
    void
    print_statement_returns_transations() {
        String headings = "Date       || Amount || Balance";
        assertEquals(headings, new Account().printStatement() );
    }

    @Test
    void
    deposit_and_print_transaction() {
        String date = "14/01/2012";
        int amount = 500;
        Account account = new Account();
        account.deposit(date, amount);

        String expectedPrintStatement = "Date       || Amount || Balance" + "\n" + "14/01/2012 || 500    || 500";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

    @Test
    void
    deposit_more_than_once_and_print_transaction() {
        String date1 = "14/01/2012";
        int amount1 = 500;
        String date2 = "15/01/2012";
        int amount2 = 1000;
        Account account = new Account();
        account.deposit(date1, amount1);
        account.deposit(date2, amount2);

        String expectedPrintStatement = "Date       || Amount || Balance"
                + "\n" + "14/01/2012 || 500    || 500"
                + "\n" + "15/01/2012 || 1000    || 1500";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

}