import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountShould {



    @Test
    void
    print_statement_returns_transations() {
        String headings = "Date       || Amount || Balance";
        assertEquals(headings, new Account().printStatement() );
    }

}