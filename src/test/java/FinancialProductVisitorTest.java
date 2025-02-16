import org.example.Stock;
import org.example.InvestmentFund;
import org.example.JsonFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinancialProductVisitorTest {
    private Stock stock;
    private InvestmentFund fund;
    private JsonFormatter jsonFormatter;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        stock = new Stock("ROXO34", 14.0);
        fund = new InvestmentFund("XYZ123", 10.0);
        jsonFormatter = new JsonFormatter();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreSystemOut() {
        System.setOut(originalOut);
    }

    @Test
    void testJsonFormatterWithStock() {
        stock.accept(jsonFormatter);
        String expected = "{\"tipo\": \"Ação\", \"símbolo\": \"ROXO34\", \"preço\": 14.0}\n";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    void testJsonFormatterWithInvestmentFund() {
        fund.accept(jsonFormatter);
        String expected = "{\"tipo\": \"FundoInvestimento\", \"nome\": \"XYZ123\", \"valorLíquido\": 10.0}\n";
        assertEquals(expected, outputStream.toString());
    }
}
