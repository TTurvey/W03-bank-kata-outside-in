import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

class TransactionPrinterShould {

    @Mock Console console;
    private final TransactionRepository repository = new TransactionRepository();
    private final TransactionPrinter printer = new TransactionPrinter(console);

    @Test
    public void prints_headings() {
        printer.printStatement(repository.transactionHistory);

        verify(console).printsToConsole("Date       || Amount || Balance");
    }

}