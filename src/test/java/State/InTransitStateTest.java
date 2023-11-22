package State;
import org.example.Package;
import org.example.state.InTransitState;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InTransitStateTest {
    @Test
    public void updateStateShouldPrintInTransitMessage() {
        Package myPackage = new Package();
        InTransitState state = new InTransitState(myPackage);
        assertEquals("Package is now In Transit.", captureOutput(state::updateState));
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
