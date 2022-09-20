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
        String date2 = "14/01/2012";
        int amount2 = 1000;
        Account account = new Account();
        account.deposit(date1, amount1);
        account.deposit(date2, amount2);

        String expectedPrintStatement = "Date       || Amount || Balance"
                + "\n" + "14/01/2012 || 500    || 500"
                + "\n" + "14/01/2012 || 1000    || 1500";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

    @Test
    void
    withdraw_and_print_transaction() {
        String date = "14/01/2012";
        int amount = 500;
        Account account = new Account();
        account.withdraw(date, amount);

        String expectedPrintStatement = "Date       || Amount || Balance" + "\n" + "14/01/2012 || -500    || -500";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

    @Test
    void
    deposit_and_withdraw_more_than_once_and_print_transaction() {
        String date1 = "14/01/2012";
        int amount1 = 500;
        String date2 = "14/01/2012";
        int amount2 = 1000;
        String date3 = "14/01/2012";
        int amount3 = 1200;
        String date4 = "14/01/2012";
        int amount4 = 10;
        Account account = new Account();
        account.deposit(date1, amount1);
        account.deposit(date2, amount2);
        account.withdraw(date3, amount3);
        account.withdraw(date4, amount4);

        String expectedPrintStatement = "Date       || Amount || Balance"
                + "\n" + "14/01/2012 || 500    || 500"
                + "\n" + "14/01/2012 || 1000    || 1500"
                + "\n" + "14/01/2012 || -1200    || 300"
                + "\n" + "14/01/2012 || -10    || 290";

        assertEquals(expectedPrintStatement, account.printStatement() );
    }

}