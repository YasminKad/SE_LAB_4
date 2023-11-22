import org.example.strategy.ExpressShippingStrategy;
import org.example.strategy.StandardShippingStrategy;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShippingSystemTest {
    @Test
    public void shipFunctionShouldPrintExpressShippingMessage() {
        ExpressShippingStrategy strategy = new ExpressShippingStrategy();
        assertEquals("Package is shipped by Express Shipping - Shipping Cost: 30$", captureOutput(strategy::ship));
    }

    @Test
    public void shipShouldPrintStandardShippingMessage() {
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