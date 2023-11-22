package Strategy;
import org.example.strategy.StandardShippingStrategy;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressShippingStrategyTest {
    @Test
    void shipFunctionShouldPrintStandardShippingMessage() {
        StandardShippingStrategy strategy = new StandardShippingStrategy();
        assertEquals("Package is shipped by Standard Shipping - Shipping Cost: 15$", captureOutput(strategy::ship));
    }

    private String captureOutput(Runnable code) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            code.run();
            return outputStream.toString().trim();
        } finally {
            System.setOut(originalOut);
        }
    }
}
