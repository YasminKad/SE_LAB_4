package State;
import org.example.Package;
import org.example.state.DeliveredState;
import org.junit.Test;
import org.example.strategy.StandardShippingStrategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DeliveredStateTest {
    @Test
    public void updateStateShouldPrintDeliveredMessage() {
        Package myPackage = new Package();
        DeliveredState state = new DeliveredState(myPackage);
        assertEquals("Package is now Delivered.", captureOutput(state::updateState));
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
