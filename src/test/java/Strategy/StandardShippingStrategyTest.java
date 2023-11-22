package Strategy;
import org.example.strategy.ExpressShippingStrategy;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardShippingStrategyTest {
    @Test
    void shipShouldPrintExpressShippingMessage() {
        ExpressShippingStrategy strategy = new ExpressShippingStrategy();
        assertEquals("Package is shipped by Express Shipping - Shipping Cost: 30$", captureOutput(strategy::ship));
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
